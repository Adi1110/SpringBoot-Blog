package com.techie.SpringBootBlog.security;

import com.techie.SpringBootBlog.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.security.KeyStore;

import javax.annotation.PostConstruct;


@Service
public class JwtProvider {

    private KeyStore keyStore;

    private Key key;

    @PostConstruct
    public void init(){

        key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
    }

    public String generateToken(Authentication authentication) {
        User principal = (User) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(principal.getUserName())
                .signWith(key)
                .compact();
    }
}
