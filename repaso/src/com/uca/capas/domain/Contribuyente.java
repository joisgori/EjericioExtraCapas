package com.uca.capas.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name="contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator = "contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(sequenceName = "public.contribuyente_c_contribuyente_seq", name = "contribuyente_c_contribuyente_seq", allocationSize = 1)
	@Column(name = "c_contribuyente")
	private Integer cContribuyente;
	
	@Column(name = "s_nombre")
	private String sNombre;
	
	@Column(name = "s_apellido")
	private String sApellido;
	
	@Column(name = "s_nit")
	private String sNit;
	
	@Column(name = "f_fecha_ingreso")
	private Date fFechaIngreso;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_importancia")
	private Importancia relacion; //el nombre que puse en el mappedBy

	public Integer getcContribuyente() {
		return cContribuyente;
	}

	public void setcContribuyente(Integer cContribuyente) {
		this.cContribuyente = cContribuyente;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public String getsNit() {
		return sNit;
	}

	public void setsNit(String sNit) {
		this.sNit = sNit;
	}

	public Date getfFechaIngreso() {
		return fFechaIngreso;
	}

	public void setfFechaIngreso(Date fFechaIngreso) {
		this.fFechaIngreso = fFechaIngreso;
	}

	public Importancia getRelacion() {
		return relacion;
	}

	public void setRelacion(Importancia relacion) {
		this.relacion = relacion;
	}

	public Contribuyente(Integer cContribuyente, String sNombre, String sApellido, String sNit, Date fFechaIngreso,
			Importancia relacion) {
		super();
		this.cContribuyente = cContribuyente;
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.sNit = sNit;
		this.fFechaIngreso = fFechaIngreso;
		this.relacion = relacion;
	}

	public Contribuyente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFechaDelegate() {
		if(this.fFechaIngreso == null) {
			return "";
		}else {
			SimpleDateFormat holi = new SimpleDateFormat("dd-MM-yyyy");
			String algo = holi.format(this.fFechaIngreso.getTime());
			return algo;
		}
	}
	

}
