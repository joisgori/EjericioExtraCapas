package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Contribuyente;

public interface ContribuyenteService {

	public int insert(Integer opciones, String nombre, String apellido, String nit);
	
	public List<Contribuyente> findAll();
	
	public void delete(Contribuyente con);
	
	public Contribuyente findByCContribuyente(Integer id);
	
}
