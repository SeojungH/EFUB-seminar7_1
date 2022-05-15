package com.example.efub.seminar701.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}