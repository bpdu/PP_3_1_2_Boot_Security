package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) { userRepository.save(user); }

    @Override
    public void deleteUser(Long id) { userRepository.deleteById(id); }

    @Override
    public User getUser(Long id) { return userRepository.getById(id); }

    @Override
    public void updateUser(Long id, String name, String email, Integer age) {
        User user = userRepository.getById(id);
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);
        userRepository.save(user);
    }

    @Override
    public List<User> getUserList() { return userRepository.findAll(); }

}
