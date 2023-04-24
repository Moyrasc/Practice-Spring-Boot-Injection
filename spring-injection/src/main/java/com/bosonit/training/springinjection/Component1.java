package com.bosonit.training.springinjection;

import org.springframework.stereotype.Component;

@Component
public class Component1 {
    public Component1(){
        System.out.println("Hi from component 1");
    }
    public String hello(){
        return " Hello!! from component one";
    }
}
