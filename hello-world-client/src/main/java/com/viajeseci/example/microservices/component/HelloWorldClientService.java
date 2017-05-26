package com.viajeseci.example.microservices.component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.viajeseci.example.microservices.feign.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by magonzales on 26/05/17.
 */
@Component
public class HelloWorldClientService {
    @Autowired
    private HelloWorldClient helloWorldClient;

    @HystrixCommand(fallbackMethod="fallbackHome")
    public String home() {
        return helloWorldClient.helloWorld() + " with Feign";
    }

    public String fallbackHome(Throwable t) {
        t.printStackTrace();
        return "There was a problem with a service: " + t.getMessage();
    }
}
