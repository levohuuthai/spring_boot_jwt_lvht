package com.example.spring_boot_jwt_lvht.service;


import com.example.spring_boot_jwt_lvht.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}