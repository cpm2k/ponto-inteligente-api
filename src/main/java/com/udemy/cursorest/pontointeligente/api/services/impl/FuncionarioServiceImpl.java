package com.udemy.cursorest.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursorest.pontointeligente.api.entities.Funcionario;
import com.udemy.cursorest.pontointeligente.api.repositories.FuncionarioRepository;
import com.udemy.cursorest.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcionário {}", funcionario);
		return funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarFuncionarioPorCpf(String cpf) {
		log.info("Buscando funcionário por CPF {}", cpf);
		return Optional.ofNullable(funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscarFuncionarioPorEmail(String email) {
		log.info("Buscando funcionário por e-mail {}", email);
		return Optional.ofNullable(funcionarioRepository.findByEmail(email));
	}

	@Override
	public Optional<Funcionario> buscarFuncionarioPorId(Long id) {
		log.info("Buscando funcionário por id {}", id);
		return Optional.ofNullable(funcionarioRepository.findOne(id));
	}

}
