package com.llf.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Oliver.li
 * @Description:
 * @date: 2017/8/1 10:05
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from(){
        return this.from;
    }
}
