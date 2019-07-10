package com.uca.capas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.repositories.ContribuyenteRepository;

@Service
public class ContribuyenteServiceImp implements ContribuyenteService{

	@Autowired
	ContribuyenteRepository contribuyenteRepository;

	@Override
	public List<Contribuyente> findAll() {
		return contribuyenteRepository.findAll();
	}

	@Transactional
	public int insert(Integer opciones, String nombre, String apellido, String nit) {
		return contribuyenteRepository.insert(opciones, nombre, apellido, nit);
	}

	@Transactional
	public void delete(Contribuyente con) {
		contribuyenteRepository.delete(con);
	}

	@Override
	public Contribuyente findByCContribuyente(Integer id) {
		return contribuyenteRepository.findByCContribuyente(id);
	}

}
