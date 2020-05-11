package com.ice.icezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer
@SpringBootApplication
public class IceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(IceZuulApplication.class, args);
    }

}
