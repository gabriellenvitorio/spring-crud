package br.edu.ifms.dbf2.ProjetoN1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.dbf2.ProjetoN1.model.Infracao;

public interface Infracoes extends JpaRepository<Infracao, Long> {
	
}