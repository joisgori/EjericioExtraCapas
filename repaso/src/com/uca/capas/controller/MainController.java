package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.service.ContribuyenteService;
import com.uca.capas.service.ImportanciaService;
import com.uca.capas.domain.*;


@Controller
public class MainController {

	@Autowired
	ContribuyenteService contribuyenteService;
	
	@Autowired
	ImportanciaService importanciaService;
	
	@RequestMapping("/")
	public ModelAndView inicio(
			@ModelAttribute("contribuyente") Contribuyente c ) {
		ModelAndView mav = new ModelAndView();
		List<Importancia> i = null;
		i = importanciaService.findAll();
		
		mav.addObject("c", i);
		mav.setViewName("importancia");
		return mav;
	}
	
	@RequestMapping(value="/guardar", method = RequestMethod.POST)
	public ModelAndView guardar(
			@RequestParam(name = "opciones") Integer opciones, @RequestParam(name="nombre") String nombre, 
			@RequestParam(name="apellido") String apellido,
			@RequestParam(name="nit") String nit) {
		ModelAndView mav = new ModelAndView();
		//List<Importancia> i = null;
		//i = importanciaService.findAll();
		contribuyenteService.insert(opciones, nombre, apellido, nit);
		//mav.addObject("c", i);
		mav.setViewName("redirect:/");
		return mav;
	}
	
	@RequestMapping("/verCon")
	public ModelAndView verContri() {
		ModelAndView mav = new ModelAndView();
		List<Contribuyente> con = contribuyenteService.findAll();
		
		mav.addObject("c", con);
		mav.setViewName("contribuyente");
		return mav;
	}
	
	@RequestMapping("/eliminar")
	public ModelAndView eliminar(
			@RequestParam Integer cContribuyente) {
		ModelAndView mav = new ModelAndView();
		Contribuyente c = contribuyenteService.findByCContribuyente(cContribuyente);
		contribuyenteService.delete(c);
		
		mav.setViewName("redirect:/verCon");
		return mav;
	}
}
