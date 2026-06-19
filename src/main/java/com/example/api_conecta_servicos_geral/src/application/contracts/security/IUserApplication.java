package com.example.api_conecta_servicos_geral.src.application.contracts.security;


import com.example.api_conecta_servicos_geral.src.domain.models.security.User;

import java.util.List;


public interface IUserApplication {
    User findById(Integer id);
    User findByUsername(String username);
    User createUser(User user);
    User updateUser(User user);
    List<User> findAll();

}


