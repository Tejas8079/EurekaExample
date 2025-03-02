package com.doctorservice.doctor_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorServiceController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;
    
    @GetMapping("/doctors")
    public String getDoctors(){
        return "List of doctors";
    }

    @GetMapping("/location")
    public String getDoctorServiceLocation(){
        return appName + " : "+port; 
    }
}
