package org.gujavasc.mybooks.api.controller;

import org.gujavasc.mybooks.api.model.Livro;
import org.gujavasc.mybooks.api.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    LivroService service;

    @GetMapping
    public ResponseEntity<List<Livro>> findAll() {
        List<Livro> livros = service.findAll();
        return ResponseEntity.ok(livros);
    }
}
