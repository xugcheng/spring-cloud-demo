package com.xugc.demo.feign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * 断路器回调类
 *
 * Created by xuguocheng on 2016/12/29.
 */
@Component
public class ComputeClientHystrix implements ComputeClient{
    @Override
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        System.out.println("**********ComputeClientHystrix**********");
        return -9999;
    }
}
