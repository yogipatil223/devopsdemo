package com.devopsdemo.devopsdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String testAPI(){
        return "Hi this is demo";
    }
}
