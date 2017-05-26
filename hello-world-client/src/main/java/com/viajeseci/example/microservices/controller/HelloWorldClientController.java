package com.viajeseci.example.microservices.controller;

import com.viajeseci.example.microservices.component.HelloWorldClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by magonzales on 26/05/17.
 */
@RestController
public class HelloWorldClientController {
    @Autowired
    HelloWorldClientService HelloWorldClientService;

    @RequestMapping("/")
    public String home() {
        return HelloWorldClientService.home();
    }
}
