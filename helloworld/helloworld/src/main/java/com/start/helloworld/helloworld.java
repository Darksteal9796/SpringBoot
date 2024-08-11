package com.start.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld{

    @GetMapping(path = "/hello")
    public String helloworld() {
        return "Hello World";
    }
}