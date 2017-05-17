package com.kd.example.rest.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.kd.example" })
@SuppressWarnings("unused")
public class RestServiceServerApp {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestServiceServerApp.class, args);
	}
}
