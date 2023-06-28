package com.denzel.udemyspring.configbean.config;

import com.denzel.udemyspring.configbean.coaches.Coach;
import com.denzel.udemyspring.configbean.coaches.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
