package com.udemy.cursorest.pontointeligente.api.services;

import java.util.Optional;

import com.udemy.cursorest.pontointeligente.api.entities.Funcionario;

/**
 * 
 * @author modesto
 *
 */
public interface FuncionarioService {

	/**
	 * Persiste um funcionário na base de dados
	 * 
	 * @param funcionario
	 * @return
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Retorna um funcionatio dado um CPF
	 * 
	 * @param cpf
	 * @return
	 */
	Optional<Funcionario> buscarFuncionarioPorCpf(String cpf);
	
	/**
	 * Retorna um funcionário por e-mmai
	 * @param email
	 * @return
	 */
	Optional<Funcionario> buscarFuncionarioPorEmail(String email);
	
	/**
	 * Retorna um funcionario por Id
	 * @param id
	 * @return
	 */
	Optional<Funcionario> buscarFuncionarioPorId(Long id);
	
	
	
	
}
