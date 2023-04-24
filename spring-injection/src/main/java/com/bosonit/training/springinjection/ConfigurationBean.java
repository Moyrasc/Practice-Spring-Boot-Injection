package com.bosonit.training.springinjection;

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
        return new Component3();
    }
}
