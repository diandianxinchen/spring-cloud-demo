package com.example.provide1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provide1Application {

    public static void main(String[] args) {
        SpringApplication.run(Provide1Application.class, args);
    }

}
