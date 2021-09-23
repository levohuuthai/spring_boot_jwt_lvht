package com.example.spring_boot_jwt_lvht.service;

import com.example.spring_boot_jwt_lvht.entity.Token;
import com.example.spring_boot_jwt_lvht.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{
    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}
