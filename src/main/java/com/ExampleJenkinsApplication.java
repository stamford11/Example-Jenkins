package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleJenkinsApplication {
	public static Logger log = LoggerFactory.getLogger(ExampleJenkinsApplication.class);

	public void init() {
		log.info("Application Started....");
	}

	public static void main(String[] args) {

		log.info("Application Executed....");
		SpringApplication.run(ExampleJenkinsApplication.class, args);
	}

}
