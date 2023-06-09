package com.example.railwayproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Restcontroller
public class RailwayProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(RailwayProjectApplication.class, args);
    }

    @GetMapping("/hello")
    public String get() {
        return "Hello";
    }

}
