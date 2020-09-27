package com.example.provide2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ALazyBoy
 * Date: 2020/9/27
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "8012: hello world";
    }
}
