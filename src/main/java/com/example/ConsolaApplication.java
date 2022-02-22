package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.PersonaServiceImpl;

@SpringBootApplication
public class ConsolaApplication implements CommandLineRunner {

	Logger LOG= LoggerFactory.getLogger(ConsolaApplication.class);
	
	@Autowired
	private PersonaServiceImpl personaServiceImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(ConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		LOG.info("\"hola desde consola, sprint boot\"");
//		LOG.warn("\"Advirtiendo a los warning\"");
		LOG.info("Estamos en App");
		personaServiceImpl.registrar("Adri");
	}

}
