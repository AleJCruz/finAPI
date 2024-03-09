package com.project.finapi.interfaceservice;

import com.project.finapi.entities.User;

import java.util.Optional;

public interface UserService {
    public Optional<User> login(String email, String passsword);
    public User registerUser(User user);
    public boolean verificationemail(String email);
}
