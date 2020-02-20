package com.vortex.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceTestController {

    @RequestMapping("resource")
    public String testResource() {
        return "资源测试";
    }

}
