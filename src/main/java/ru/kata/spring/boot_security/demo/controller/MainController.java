package ru.kata.spring.boot_security.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ru.kata.spring.boot_security.demo.model.User;

public interface MainController {
    public String listUsers(Model model);
    public String createUserForm(Model model);
    public String saveUser(@ModelAttribute("user") User user);
    public String editUserForm(@PathVariable Long id, Model model);
    public String updateUser(@PathVariable Long id, @ModelAttribute("user") User user, Model model);
    public String deleteUser(@PathVariable Long id);
}
