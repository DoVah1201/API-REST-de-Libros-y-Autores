package com.ejercicio2.libros_autores.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.ejercicio2.libros_autores.model.Autor;
import com.ejercicio2.libros_autores.service.AutorService;

@RestController
@RequestMapping("/api/v1/autores")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public List<Autor> listar() {
        return autorService.listarAutores();
    }

    @GetMapping("/{id}")
    public Optional<Autor> autorId(@PathVariable Long id) {
        return autorService.obtenerId(id);
    }
    
    @PostMapping
    public Autor añadirAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }
}

    


