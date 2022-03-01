package com.example.springbootdemoclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/route")
public class SpringBootDemoClientApplication {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoClientApplication.class, args);
    }

    @RequestMapping
    public String check() {
        return "Working " + environment.getProperty("local.server.port");
    }

}
