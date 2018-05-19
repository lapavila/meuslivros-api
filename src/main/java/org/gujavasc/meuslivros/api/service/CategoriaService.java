package org.gujavasc.mybooks.api.service;

import org.gujavasc.mybooks.api.model.Categoria;
import org.gujavasc.mybooks.api.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repository;

    public List<Categoria> findAll() {
        return repository.findAll();
    }
}
