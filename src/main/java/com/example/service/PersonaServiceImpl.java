package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConsolaApplication;
import com.example.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepo iPersonaRepo;
	
    Logger logger = LoggerFactory.getLogger(ConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		logger.info("Estamos en Service");
		iPersonaRepo.registrar(nombre+ " Vidal ");		
	}
	
}
