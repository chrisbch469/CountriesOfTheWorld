package com.chrisboich.countriesoftheworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan //needed to scan packages for components and classes
public class AppConfig {
    public static void main(String[] args) {
        //run spring framework configuration
        SpringApplication.run(AppConfig.class, args);
    }
}
