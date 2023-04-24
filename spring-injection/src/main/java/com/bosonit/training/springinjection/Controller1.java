package com.bosonit.training.springinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    //SpringBoot al arrancar escanea las clases, si encuentra
    // un @component lo mete en un contexto, de forma que cualquier otra clase con Autowired y que haya inicializado el propio Spring podremos usarlo
    @Autowired
    Component1 component1;
    Component2 component2;
    public Controller1(Component1 component1, Component2 component2){
        this.component1 = component1;
        this.component2 = component2;
        System.out.println("Initializing from Controller1");
    }
    @GetMapping("/")
    public String hello(){
        var component2 = new Component2();
        return "Hello from controller "+ component1.hello();
    }
}
