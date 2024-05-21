package com.mn.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityPocApplication.class, args);
		System. out. println("Current JVM version - " + System. getProperty("java.version"));
		
	}

}
