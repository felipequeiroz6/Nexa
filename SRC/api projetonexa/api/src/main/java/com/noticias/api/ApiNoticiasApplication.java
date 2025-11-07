package com.noticias.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiNoticiasApplication {

	public static void main(String[] args) {
		org.springframework.context.ConfigurableApplicationContext run = SpringApplication.run(ApiNoticiasApplication.class, args);
	}

}
