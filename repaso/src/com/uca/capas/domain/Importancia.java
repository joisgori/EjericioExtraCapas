package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public",name = "importancia")
public class Importancia {
	
	//Primero creo los atributos y después las anotaciones, sino no me sugiere las opciones correctas.
	@Id
	@GeneratedValue(generator = "importancia_c_importancia_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(sequenceName = "public.importancia_c_importancia_seq", name = "importancia_c_importancia_seq", allocationSize = 1)
	@Column(name="c_importancia")
	private Integer cImportancia;
	
	@Column(name = "s_importancia")
	private String sImportancia;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "relacion")
	private List<Contribuyente> contribuyentes;

	public Integer getcImportancia() {
		return cImportancia;
	}

	public void setcImportancia(Integer cImportancia) {
		this.cImportancia = cImportancia;
	}

	public List<Contribuyente> getContribuyentes() {
		return contribuyentes;
	}

	public void setContribuyentes(List<Contribuyente> contribuyentes) {
		this.contribuyentes = contribuyentes;
	}
	

	public Importancia(Integer cImportancia, String sImportancia, List<Contribuyente> contribuyentes) {
		super();
		this.cImportancia = cImportancia;
		this.sImportancia = sImportancia;
		this.contribuyentes = contribuyentes;
	}

	public String getsImportancia() {
		return sImportancia;
	}

	public void setsImportancia(String sImportancia) {
		this.sImportancia = sImportancia;
	}

	public Importancia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
