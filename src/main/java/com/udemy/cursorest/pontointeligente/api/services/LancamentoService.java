package com.udemy.cursorest.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.udemy.cursorest.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {

	public Page<Lancamento> buscarPorFuncionario(Long funcionarioId, PageRequest pageRequest);
	
	public Optional<Lancamento> buscarPorId(Long id);
	
	public Lancamento persist(Lancamento lancamento);
	
	public void remover(Long id);
	
}
