package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsolaApplication implements CommandLineRunner {

	Logger LOG= LoggerFactory.getLogger(ConsolaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("\"hola desde consola, sprint boot\"");
		LOG.warn("\"Advirtiendo a los warning\"");
	}

}
