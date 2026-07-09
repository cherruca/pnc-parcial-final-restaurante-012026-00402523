package com.uca.pncparcialfinalrestaurante.dto;

public class LoginResponse {

    private String accessToken;
    private String refreshToken;

    public LoginResponse() {
    }

    public LoginResponse(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

}
