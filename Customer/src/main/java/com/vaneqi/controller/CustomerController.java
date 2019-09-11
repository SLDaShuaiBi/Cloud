package com.vaneqi.controller;

import com.vaneqi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:Cloud
 * @Author:SL
 * @Date:2019-9-11 20:39
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/hello.do")
    public String hello(){

        return customerService.Hello();
    }
}
