package com.selftest.common.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @GetMapping
    public String callback(@RequestParam(name="code") String code,
                           @RequestParam(name="state") String state){
        return "index";
    }
}
