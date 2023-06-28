package com.denzel.udemyspring.devtools.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(@RequestParam(value = "name", defaultValue = "motherfucker")String name) {
        return String.format("Hello %s!", name);
    }

    // expose new endpoint for workout to test devtools
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 10k! STAY HARD!";
    }

    // expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is a day to STAY HARD!!!";
    }
}
