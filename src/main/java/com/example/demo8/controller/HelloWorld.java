package com.example.demo8.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorld {

    @GetMapping
    public String helloWorld(){
        return  "Hola mundo";
    }
}
