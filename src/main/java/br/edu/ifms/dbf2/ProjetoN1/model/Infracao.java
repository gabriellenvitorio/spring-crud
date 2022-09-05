package br.edu.ifms.dbf2.ProjetoN1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Infracao implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private int pontos;
	private double valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id= id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}