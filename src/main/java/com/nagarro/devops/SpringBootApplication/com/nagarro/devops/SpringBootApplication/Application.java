package com.nagarro.devops.SpringBootApplication.com.nagarro.devops.SpringBootApplication;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static final org.slf4j.Logger Logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		Logger.info("its a CI job ");
		SpringApplication.run(Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Logger.info("its my second logger");
	}
}
