package com.project.finapi.service;

import com.project.finapi.entities.User;
import com.project.finapi.interfaceservice.UserService;
import com.project.finapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return Optional.of(user);
        } else {
            return Optional.empty();
        }
    }

    public boolean verificationemail(String email){
        if (userRepository.findByEmail(email) != null){
            return true;
        }else {
            return false;
        }
    }

    public User registerUser(User user){
        return userRepository.save(user);
    }

}
