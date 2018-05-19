package org.gujavasc.meuslivros.api.service;

import org.gujavasc.meuslivros.api.model.Usuario;
import org.gujavasc.meuslivros.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> optional = repository.findByUsername(username);
        Usuario usuario = optional.orElseThrow(() -> new UsernameNotFoundException("Usuário ou senha inválidos"));
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        usuario.getPermissoes().forEach(e -> authorities.add(new SimpleGrantedAuthority(e.getNome())));
        return new User(username, usuario.getPassword(), authorities);
    }
}
