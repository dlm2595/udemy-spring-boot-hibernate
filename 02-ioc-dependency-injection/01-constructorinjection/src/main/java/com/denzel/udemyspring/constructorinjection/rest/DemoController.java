package com.denzel.udemyspring.constructorinjection.rest;

import com.denzel.udemyspring.constructorinjection.coaches.Coach;
import com.denzel.udemyspring.constructorinjection.coaches.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for dependency
    private final Coach myCoach;

    //define constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
