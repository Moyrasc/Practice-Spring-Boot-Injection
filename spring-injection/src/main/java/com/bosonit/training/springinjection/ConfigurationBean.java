package com.bosonit.training.springinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
    //Bean deberá ir siempre dentro de cualquier clase que tenga la etiqueta @configuration.
    public ConfigurationBean(){
        System.out.println("Initialization Configuration Beans");
    }
    @Bean
    Component3 getComponent3(){
        var c = new Component3();
        return c;
    }
    @Bean
    @Qualifier("component1Bean")
    Component1 getComponent1(){
        var c = new Component1();
        c.name = "NAME BEAN";
        return c;
    }
}
