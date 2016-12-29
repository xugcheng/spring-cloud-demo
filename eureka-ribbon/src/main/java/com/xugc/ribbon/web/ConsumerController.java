package com.xugc.ribbon.web;

import com.xugc.ribbon.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xuguocheng on 2016/12/5.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping("/add")
    public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) throws Exception {
        return computeService.addService(a, b);
    }

}
