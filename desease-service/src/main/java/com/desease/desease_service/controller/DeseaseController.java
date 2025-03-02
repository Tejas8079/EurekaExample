package com.desease.desease_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeseaseController {
    
    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;


    @GetMapping("/desease")
    public String getDesease(){
        return "List of desease";
    }

    @GetMapping("/location")
    public String deseaseLocation(){
        return appName+ " : " +port;
    }
}
