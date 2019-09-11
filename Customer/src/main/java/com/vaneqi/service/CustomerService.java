package com.vaneqi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program:Cloud
 * @Author:SL
 * @Date:2019-9-11 20:36
 */
@FeignClient("Provider")
public interface CustomerService {
    @GetMapping("/hello.do")
     String Hello();

}
