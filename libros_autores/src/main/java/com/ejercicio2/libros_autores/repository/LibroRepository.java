package com.ejercicio2.libros_autores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio2.libros_autores.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}