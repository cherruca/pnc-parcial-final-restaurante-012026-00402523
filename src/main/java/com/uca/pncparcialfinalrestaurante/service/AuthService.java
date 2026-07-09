package com.uca.pncparcialfinalrestaurante.service;

import com.uca.pncparcialfinalrestaurante.config.JwtService;
import com.uca.pncparcialfinalrestaurante.repository.UsuarioRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UsuarioRepository usuarioRepository;

    public AuthService(AuthenticationManager authenticationManager,
                       JwtService jwtService,
                       UsuarioRepository usuarioRepository) {

        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.usuarioRepository = usuarioRepository;
    }

}
