package com.denzel.udemyspring.beanlifecycle.coaches;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    // init
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Inside doMyStartupStuff for " + getClass().getSimpleName());
    }

    // destroy
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("Inside doMyCleanupStuff for " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
