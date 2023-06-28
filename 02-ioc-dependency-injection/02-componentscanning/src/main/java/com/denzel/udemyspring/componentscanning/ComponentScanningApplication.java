package com.denzel.udemyspring.componentscanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.denzel.udemyspring.componentscanning",
		"com.denzel.udemyspring.util"}
)
public class ComponentScanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanningApplication.class, args);
	}

}
