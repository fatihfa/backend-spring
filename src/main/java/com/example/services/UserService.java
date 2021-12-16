package com.example.services;

import java.util.List;

import com.example.models.Role;
import com.example.models.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    User findByOne(Long id);

    List<User>getUsers();
}
