package com.example.spring_boot_jwt_lvht.repository;

import com.example.spring_boot_jwt_lvht.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {

}