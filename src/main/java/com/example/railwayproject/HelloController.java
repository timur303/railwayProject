package com.example.railwayproject;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

  @GetMapping("/hello")
    public String getHello() {
        return "Hello world";
    }
}
