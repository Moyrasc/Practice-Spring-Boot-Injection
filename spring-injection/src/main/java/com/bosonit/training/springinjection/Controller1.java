package com.bosonit.training.springinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    //SpringBoot al arrancar escanea las clases, si encuentra
    // un @component lo mete en un contexto, de forma que cualquier otra clase con Autowired y que haya inicializado el propio Spring podremos usarlo
    @Autowired
    ComponentInterface component1;
    Component2 component2;

    @Autowired
    Component3 component3;
    public Controller1(@Qualifier("component1Bean") ComponentInterface component1, Component2 component2){
        this.component1 = component1;
        this.component2 = component2;
        System.out.println("Initializing from Controller1. Name: " + component1.getName());
    }
    @GetMapping("/")
    public String hello(){
        var component2 = new Component2();
        return "Hello from controller "+ component1.hello();
    }
    @GetMapping("/3")
    public String bye(){

        return "Hello from controller "+ component3.bye();
    }
}
