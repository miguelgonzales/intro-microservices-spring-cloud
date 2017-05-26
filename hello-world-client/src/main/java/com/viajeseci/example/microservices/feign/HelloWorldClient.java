package com.viajeseci.example.microservices.feign;

import com.viajeseci.example.microservices.config.BasicConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by magonzales on 26/05/17.
 */
@FeignClient(name="hello-world",  configuration = BasicConfiguration.class)
public interface HelloWorldClient {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String helloWorld();
}
