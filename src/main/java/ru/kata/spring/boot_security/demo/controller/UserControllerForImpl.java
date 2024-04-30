package ru.kata.spring.boot_security.demo.controller;

import org.springframework.ui.Model;
import ru.kata.spring.boot_security.demo.model.User;

public interface UserControllerForImpl {
    public String userProfile(Model model);
    public String updateUser(User userForm, String password);
}
