package com.llf.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Oliver.li
 * @Description:
 * @date: 2017/7/19 16:19
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return -9999;
    }
}
