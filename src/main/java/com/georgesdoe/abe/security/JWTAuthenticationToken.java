package com.georgesdoe.abe.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;

import java.util.ArrayList;

public class JWTAuthenticationToken extends AbstractAuthenticationToken {

    private String token;

    JWTAuthenticationToken(String token) {
        super(new ArrayList<>());
        this.token = token;
    }

    public String getToken(){
        return token;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}