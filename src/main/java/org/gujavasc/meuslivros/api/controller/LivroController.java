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
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    LivroService service;

    @Autowired
    ModelMapper mapper;

    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_PESQUISAR_LIVRO') and #oauth2.hasScope('read')")
    public ResponseEntity<List<Livro>> findAll() {
        List<Livro> livros = service.findAll();
        return ResponseEntity.ok(livros);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_PESQUISAR_LIVRO') and #oauth2.hasScope('read')")
    public ResponseEntity<Livro> findById(@PathVariable Long id) {
        Livro livro = service.findById(id);
        return ResponseEntity.ok(livro);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_CADASTRAR_LIVRO') and #oauth2.hasScope('write')")
    public ResponseEntity<Livro> save(@RequestBody LivroDto dto) {
        Livro livro = mapper.map(dto, Livro.class);
        livro = service.save(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(livro);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_REMOVER_LIVRO') and #oauth2.hasScope('read')")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
