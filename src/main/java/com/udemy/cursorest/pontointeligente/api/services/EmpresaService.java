package com.udemy.cursorest.pontointeligente.api.services;

import java.util.Optional;

import com.udemy.cursorest.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um CNPJ válido
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Empresa> buscarPorCNPJ(String cnpj);
	
	
	/**
	 * Cadastra uma nova empresa na base de dados
	 * @param empresa
	 * @return
	 */
	Empresa pesistir(Empresa empresa);
	
}
