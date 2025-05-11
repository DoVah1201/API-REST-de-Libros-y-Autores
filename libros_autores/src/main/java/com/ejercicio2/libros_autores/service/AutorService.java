package com.ejercicio2.libros_autores.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;




import com.ejercicio2.libros_autores.model.Autor;
import com.ejercicio2.libros_autores.repository.AutorRepository;

@Service
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
