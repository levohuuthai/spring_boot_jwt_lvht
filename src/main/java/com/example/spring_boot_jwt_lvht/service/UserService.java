package com.example.spring_boot_jwt_lvht.service;

import com.example.spring_boot_jwt_lvht.authen.UserPrincipal;
import com.example.spring_boot_jwt_lvht.entity.User;

public interface UserService {
    User createUser(User user);

}
