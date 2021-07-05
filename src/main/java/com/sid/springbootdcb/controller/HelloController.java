package com.sid.springbootdcb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/health")
    public String helloWorld() {
        return "Yo Bitch!";
    }
}
