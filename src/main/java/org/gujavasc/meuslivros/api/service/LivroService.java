package org.gujavasc.meuslivros.api.service;

import org.gujavasc.meuslivros.api.model.Livro;
import org.gujavasc.meuslivros.api.repository.LivroRepository;
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

    public Livro save(Livro livro) {
        return repository.save(livro);
    }
}
