package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "<h1>Hello, World!</h1><p>Welcome to My Web App</p>";
    }
}
