package com.ejercicio2.libros_autores.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ejercicio2.libros_autores.model.Libro;
import com.ejercicio2.libros_autores.repository.LibroRepository;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    public Optional<Libro> obtenerId(Long id) {
        return libroRepository.findById(id);
    }

    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro actualizarLibro(Libro libro, Long id) {
        libro.setId(id);
        return libroRepository.save(libro);
    }

    public void eliminarLibro(Libro libro) {
        libroRepository.delete(libro);
    }

    
    public List<Libro> buscarLibros(String titulo, String isbn, Integer anioPublicacion, Long autorId) {
        return libroRepository.findByFiltros(titulo, isbn, anioPublicacion, autorId);
    }

}
    