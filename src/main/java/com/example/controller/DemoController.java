package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @Value("${override.value}")
    private String value;

    @GetMapping("/name")
    public String name(){
        return value+" jyuka2-04-27";
    }



}
