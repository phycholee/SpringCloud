package com.llf.springcloud.controller;

import com.llf.springcloud.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Oliver.li
 * @Description:
 * @date: 2017/7/19 14:56
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(20, 99);
    }

}
