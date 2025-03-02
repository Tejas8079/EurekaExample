package com.doctorportal.doctor_portal_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@RestController
public class DoctorPortalController {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;
    
    @Autowired
    EurekaClient eurekaClient;

    @GetMapping("/getDoctors")
    public String getDoctors(){
        RestTemplate restTemplate = restTemplateBuilder.build();

        String baseUrl = eurekaClient.getNextServerFromEureka("DOCTOR-SERVICE", false)
        .getHomePageUrl();

        return restTemplate.getForObject(baseUrl+"/location", String.class);
    }
}
