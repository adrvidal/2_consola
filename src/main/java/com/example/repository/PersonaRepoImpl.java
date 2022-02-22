package com.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.ConsolaApplication;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl implements IPersonaRepo {

	Logger logger = LoggerFactory.getLogger(ConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		logger.info("Estamos en Repository, registramos el nombre: " + nombre);
	}

}
