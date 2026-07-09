package com.uca.pncparcialfinalrestaurante;

import com.uca.pncparcialfinalrestaurante.dto.LoginRequest;
import com.uca.pncparcialfinalrestaurante.dto.LoginResponse;
import com.uca.pncparcialfinalrestaurante.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request){

        return service.login(request);

    }

    @PostMapping("/refresh")
    public LoginResponse refresh(@RequestBody RefreshTokenRequest request){

        return service.refresh(request);

    }

}
