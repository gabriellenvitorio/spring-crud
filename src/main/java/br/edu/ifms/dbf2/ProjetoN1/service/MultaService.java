package br.edu.ifms.dbf2.ProjetoN1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.dbf2.ProjetoN1.model.Carro;
import br.edu.ifms.dbf2.ProjetoN1.model.Multa;
import br.edu.ifms.dbf2.ProjetoN1.repository.Carros;
import br.edu.ifms.dbf2.ProjetoN1.repository.Multas;

@Service
public class MultaService {
	@Autowired
	private Multas multas;
	@Autowired
	private Carros carros;

	public List<Multa> buscarTodos() {
		return multas.findAll();
	}

	public void salvar(Multa multa) {
		Carro carro = carros.findByPlaca(multa.getCarro().getPlaca());
		multa.setCarro(carro);
		multas.save(multa);
	}
	
	public Multa procurar(Long id) {
		return multas.getOne(id);
	}

	public void deletar(Long id) {
		multas.deleteById(id);
		
	}

}