package com.ejercicio2.libros_autores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ejercicio2.libros_autores.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

     @Query("SELECT l FROM Libro l WHERE " +
           "(:titulo IS NULL OR l.titulo LIKE %:titulo%) " +
           "AND (:isbn IS NULL OR l.isbn LIKE %:isbn%) " +
           "AND (:anioPublicacion IS NULL OR l.anioPublicacion = :anioPublicacion) " +
           "AND (:autorId IS NULL OR l.autor.id = :autorId)")
            List<Libro> findByFiltros(@Param("titulo") String titulo, @Param("isbn") String isbn, @Param("anioPublicacion") Integer anioPublicacion, @Param("autorId") Long autorId);

}