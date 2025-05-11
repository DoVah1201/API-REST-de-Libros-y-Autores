package com.ejercicio2.libros_autores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio2.libros_autores.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {


}
