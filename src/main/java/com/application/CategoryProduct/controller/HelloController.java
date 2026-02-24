package com.application.CategoryProduct.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

    @GetMapping("/hello/{message}")
    public String hello(@PathVariable String message) {
        return "Hello " + message;
    }
}