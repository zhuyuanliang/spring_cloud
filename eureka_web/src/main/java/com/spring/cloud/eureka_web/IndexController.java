package com.spring.cloud.eureka_web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    @Resource
    private BaseService baseService;
    @RequestMapping("/hi")
    public String hi(){
        return baseService.getOne();
    }
}
