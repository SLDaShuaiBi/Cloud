package com.vaneqi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:Cloud
 * @Author:SL
 * @Date:2019-9-11 20:24
 */
@RestController
public class ProviderController {

    @GetMapping("/hello.do")
    public String Hello(){
        System.out.println("服务提供者");

        return "服务提供者++++++++++";
    }
}
