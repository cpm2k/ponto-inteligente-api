package com.udemy.cursorest.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursorest.pontointeligente.api.entities.Empresa;
import com.udemy.cursorest.pontointeligente.api.repositories.EmpresaRepository;
import com.udemy.cursorest.pontointeligente.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCNPJ(String cnpj) {
		log.info("Buscando empresa por CNPJ {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa pesistir(Empresa empresa) {
		log.info("Pesistindo empresa: {}", empresa);
		return this.empresaRepository.save(empresa);
	}

}
