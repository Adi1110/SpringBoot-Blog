package com.techie.SpringBootBlog.controller;

import com.techie.SpringBootBlog.dto.LoginRequest;
import com.techie.SpringBootBlog.dto.RegisterRequest;
import com.techie.SpringBootBlog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }


    public String login(@RequestBody LoginRequest loginRequest){

        return authService.login(loginRequest);
    }
}
