package com.finsoft.service;

import com.finsoft.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    void delete(long id);
}
