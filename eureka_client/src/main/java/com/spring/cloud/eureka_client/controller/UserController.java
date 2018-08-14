package com.spring.cloud.eureka_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/getUser")
    public String getUser(){
        return "this server port is "+port;
    }
}
