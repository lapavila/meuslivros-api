package org.gujavasc.meuslivros.api.service;

import org.gujavasc.meuslivros.api.model.Livro;
import org.gujavasc.meuslivros.api.model.Usuario;
import org.gujavasc.meuslivros.api.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    LivroRepository repository;

    public List<Livro> findAll() {
        return repository.findAll();
    }

    public Livro findById(Long id) {
        Optional<Livro> optional = repository.findById(id);
        Livro livro = optional.orElseThrow(() -> new UsernameNotFoundException("Livro Não encontrado"));
        return livro;
    }

    public Livro save(Livro livro) {
        return repository.save(livro);
    }

    public void delete(Long id) {
        Livro livro = repository.getOne(id);
        repository.delete(livro);
    }
}
