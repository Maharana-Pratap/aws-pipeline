package com.example.aws_pideline.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String sayHello(String name) {
        return "Hello "+name+" in aws pipeline code build.";
    }
}
