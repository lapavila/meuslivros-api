package org.gujavasc.meuslivros.api.controller;

import org.gujavasc.meuslivros.api.dto.LivroDto;
import org.gujavasc.meuslivros.api.model.Livro;
import org.gujavasc.meuslivros.api.service.LivroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    LivroService service;

    @Autowired
    ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<Livro>> findAll() {
        List<Livro> livros = service.findAll();
        return ResponseEntity.ok(livros);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_CADASTRAR_LIVRO') and #oauth2.hasScope('write')")
    public ResponseEntity<Livro> save(@RequestBody LivroDto dto) {
        Livro livro = mapper.map(dto, Livro.class);
        livro = service.save(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(livro);
    }
}
