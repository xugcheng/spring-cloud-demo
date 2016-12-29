package com.xugc.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xuguocheng on 2016/12/23.
 */
@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用Hystrix断路器,当服务不可用时,通过制定的fallbackMethod来"熔断".
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(@RequestParam("a") Integer a, @RequestParam("b") Integer b) throws Exception {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=" + a + "&b=" + b, String.class).getBody();
    }

    public String addServiceFallback(Integer a, Integer b) {
        return "error";
    }

}
