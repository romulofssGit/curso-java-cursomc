package com.romulocurso.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romulocurso.cursomc.domain.Categoria;
import com.romulocurso.cursomc.domain.Cidade;
import com.romulocurso.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	/*
		A anotação @Repository junto com o interface JpaRepository 
	 	Permite fazer as operações de CRUD do objeto Categoria que está mapeando o banco de dados 	 
	*/
}
