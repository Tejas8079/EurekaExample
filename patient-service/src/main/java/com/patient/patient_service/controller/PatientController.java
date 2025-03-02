package com.patient.patient_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;
    

    @GetMapping("/patient")
    public String patientList(){
        return "List of Patient";
    }

    @GetMapping("/location")
    public String patientLocation(){
        return appName+ " : " + port;
    }
}
