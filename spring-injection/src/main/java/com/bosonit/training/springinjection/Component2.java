package com.bosonit.training.springinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Component2 {
    @Autowired
    Component1 component1;
    public Component2(){
        System.out.println("Initialization from component two");
    }
    public String hello(){
        if(component1 == null){
            return "Component one is null";
        } else {
            return " Hello!! from component two\n " + component1.hello();
        }
    }
}
