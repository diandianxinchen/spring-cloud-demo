package com.example.provide1.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
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
        return "8011: hello world";
    }
}
