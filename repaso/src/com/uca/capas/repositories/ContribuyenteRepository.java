package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uca.capas.domain.Contribuyente;

public interface ContribuyenteRepository extends JpaRepository<Contribuyente, Integer>{

	@Modifying(clearAutomatically = true)
	@Query(value="insert into public.contribuyente(c_importancia, s_nombre, s_apellido, s_nit) values (:opciones, :nombre, :apellido, :nit)", nativeQuery = true)
	public int insert(@Param("opciones") Integer opciones, @Param("nombre") String nombre,
			@Param("apellido") String apellido, @Param("nit") String nit);
	
	public Contribuyente findByCContribuyente(Integer id);

}
