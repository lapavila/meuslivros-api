package org.gujavasc.mybooks.api.service;

import org.gujavasc.mybooks.api.model.Livro;
import org.gujavasc.mybooks.api.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    LivroRepository repository;

    public List<Livro> findAll() {
        return repository.findAll();
    }
}
