package com.example.microservices.controller;

import com.example.microservices.bean.Limits;
import com.example.microservices.config.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    LimitsConfiguration config;

    @GetMapping("/limits")
    public Limits retrieveLimits(){

        return new Limits(1,1002);
    }
    @GetMapping("/limits-config")
    public Limits retrieveLimitsConfig(){
        return new Limits(config.getMinimum(),config.getMaximum());
    }
    
}
