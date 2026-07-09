package com.uca.pncparcialfinalrestaurante.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtService {

    private final String SECRET="MI_CLAVE_SUPER_SECRETA";

    public String generarAccessToken(UserDetails user){

        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+900000))
                .signWith(SignatureAlgorithm.HS256,SECRET)
                .compact();
    }

    public String generarRefreshToken(UserDetails user){

        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+604800000))
                .signWith(SignatureAlgorithm.HS256,SECRET)
                .compact();
    }

}
