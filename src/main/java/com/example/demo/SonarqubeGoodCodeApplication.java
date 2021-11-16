package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarqubeGoodCodeApplication {

	public static void main(String[] args) {
		String password = "abc123";
		SpringApplication.run(SonarqubeGoodCodeApplication.class, args);
	}

}
