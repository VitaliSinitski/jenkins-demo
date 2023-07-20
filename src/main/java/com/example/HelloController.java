package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Hi, my World!";
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}

