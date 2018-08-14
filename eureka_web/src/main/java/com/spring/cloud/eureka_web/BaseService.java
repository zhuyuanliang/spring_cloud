package com.spring.cloud.eureka_web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class BaseService {
    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getOneFallback")
    public String getOne() {
        return restTemplate.getForObject("http://REGISTRY-CLIENT/user/getUser", String.class);
    }

    public String getOneFallback() {
        return "sorry ribbon, it's error!";
    }
}
