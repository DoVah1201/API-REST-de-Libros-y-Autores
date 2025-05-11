package com.ejercicio2.libros_autores.service;

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
=======


>>>>>>> bafec6f519a4554ccc00f5c4a1d94dd296b66d42
import com.ejercicio2.libros_autores.model.Autor;
import com.ejercicio2.libros_autores.repository.AutorRepository;

public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> obtenerId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor actualizarAutor(Autor autor, Long id) {
        autor.setId(id);
        return autorRepository.save(autor);
    }

    public void eliminarAutor(Autor autor) {
        autorRepository.delete(autor);
    }


}
