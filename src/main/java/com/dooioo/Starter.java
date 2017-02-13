package com.dooioo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Starter {
    public static void main(String args[]) {
        SpringApplication.run(Starter.class, args);
    }
}
