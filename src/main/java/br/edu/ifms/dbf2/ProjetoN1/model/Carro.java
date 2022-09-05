package br.edu.ifms.dbf2.ProjetoN1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carro implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String placa;
	
	@OneToMany(mappedBy="carro", cascade = CascadeType.ALL)
	private List<Multa>	multas = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id= id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa= placa;
	}
	public List<Multa> getMultas() {
		return multas;
	}
	public void setMultas(List<Multa> multas) {
		this.multas = multas;
	}
		
}