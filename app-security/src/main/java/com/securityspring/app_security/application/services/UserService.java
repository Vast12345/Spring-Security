package com.securityspring.app_security.application.services;

import java.util.List;

import com.securityspring.app_security.domain.entities.User;

public interface UserService {
    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
