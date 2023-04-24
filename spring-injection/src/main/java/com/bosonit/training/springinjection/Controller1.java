package com.bosonit.training.springinjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    public Controller1(){
        System.out.println("Initializing from Controller1");
    }
    @GetMapping("/")
    public String hello(){
        return "Hello from controller";
    }
}
