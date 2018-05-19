package org.gujavasc.meuslivros.api.service;

import org.gujavasc.meuslivros.api.model.Categoria;
import org.gujavasc.meuslivros.api.repository.CategoriaRepository;
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
