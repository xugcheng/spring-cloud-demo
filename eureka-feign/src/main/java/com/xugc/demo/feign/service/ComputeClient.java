package com.xugc.demo.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xuguocheng on 2016/12/22.
 */
@FeignClient(serviceId = "compute-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
