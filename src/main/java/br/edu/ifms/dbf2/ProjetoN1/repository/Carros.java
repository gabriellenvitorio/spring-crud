package br.edu.ifms.dbf2.ProjetoN1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.dbf2.ProjetoN1.model.Carro;

public interface Carros extends JpaRepository<Carro, Long> {

	public Carro findByPlaca(String placa);
	
}