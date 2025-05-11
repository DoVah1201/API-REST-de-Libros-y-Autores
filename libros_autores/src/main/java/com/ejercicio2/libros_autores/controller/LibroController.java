package com.ejercicio2.libros_autores.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio2.libros_autores.model.Libro;
import com.ejercicio2.libros_autores.service.LibroService;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> listar() {
        return libroService.listarLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> libroId(@PathVariable Long id) {
        return libroService.obtenerId(id);
    }

    @PostMapping
    public Libro añadLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @PutMapping("/{id}")
    public Libro actualizar(@RequestBody Libro libro, @PathVariable Long id) {
        return libroService.actualizarLibro(libro, id);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Libro libro) {
        libroService.eliminarLibro(libro);
    }

    @GetMapping("/buscar")
    public List<Libro> buscar(@RequestBody Libro libro) {
        return libroService.buscarLibros(libro.getTitulo(), libro.getIsbn(), libro.getAnioPublicacion(), libro.getAutor() != null ? libro.getAutor().getId() : null);
    }
}
