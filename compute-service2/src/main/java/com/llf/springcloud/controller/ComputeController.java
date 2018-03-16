package com.llf.springcloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Oliver.li
 * @Description:
 * @date: 2017/7/19 11:52
 */
@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(this.getClass());


    @Autowired
    private DiscoveryClient client;


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Integer a, Integer b){
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;

        logger.info("compute-service2 /add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return "compute-service2 Result=" + r;
    }

}
