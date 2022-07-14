package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
    void updateUser(Long id, String name, String email, Integer age,
                    String username, String password, Set<Role> roleSet);
    List<User> getUserList();
}
