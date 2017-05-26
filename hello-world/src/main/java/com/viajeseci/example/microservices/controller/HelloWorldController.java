package com.viajeseci.example.microservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by magonzales on 25/05/17.
 */
@RestController
class HelloWorldController {

    @Value("${message:Hello default}")
    private String message;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String home() {
        logger.debug("Message return --> " + message);
        return message;
    }
}