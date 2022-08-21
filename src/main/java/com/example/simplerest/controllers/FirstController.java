package com.example.simplerest.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String test(){
        return "Test successful";
    }


    @GetMapping("/second-test")
    public String testTwo(){
        return "Second Test successful";
    }
}
