package com.example.provide3.controller;

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
        return "8013: hello world";
    }
}