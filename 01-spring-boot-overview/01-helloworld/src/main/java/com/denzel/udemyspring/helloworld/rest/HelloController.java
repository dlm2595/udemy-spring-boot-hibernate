package com.denzel.udemyspring.helloworld.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(@RequestParam(value = "name", defaultValue = "motherfucker")String name) {
        return String.format("Hello %s!", name);
    }
}
