package com.espe_plus.web.controller;

import com.espe_plus.domain.service.ESPEPlusAIService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String platform;
    private final ESPEPlusAIService aiService;
    public HelloController(@Value("${spring.application.name}") String platform, ESPEPlusAIService aiService){
        this.platform = platform;
        this.aiService = aiService;
    }
    @GetMapping("/hello")
    public String hello(){
        return this.aiService.generateGreeting(platform);
    }
}
