package br.edu.ifms.dbf2.ProjetoN1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Multa implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String ano;
	private String cidade;
	
	@ManyToOne
	@JoinColumn(name = "carro_id")
	private Carro carro;
	
	@ManyToOne
	@JoinColumn(name = "infracao_id")
	private Infracao infracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Infracao getInfracao() {
		return infracao;
	}

	public void setInfracao(Infracao infracao) {
		this.infracao = infracao;
	}
	
	
}
