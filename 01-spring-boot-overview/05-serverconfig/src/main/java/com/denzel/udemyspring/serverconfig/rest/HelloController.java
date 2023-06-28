package com.denzel.udemyspring.serverconfig.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // inject properties for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

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

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }
}
