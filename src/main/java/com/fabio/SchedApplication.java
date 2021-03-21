package com.fabio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedApplication.class, args);
	}

}
