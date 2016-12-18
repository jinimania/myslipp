package com.ssoon.web;

import com.ssoon.domain.User;
import com.ssoon.domain.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LeeSoohoon
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/form")
    public String form() {
        return "/user/form";
    }

    @PostMapping(value = "")
    public String create(final User user) {
        System.out.println("user: " + user);
        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping(value = "")
    public String list(final Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "/user/list";
    }

    @GetMapping(value = "/{id}/form")
    public String updateForm(final @PathVariable Long id, final Model model) {
        final User user = userRepository.findOne(id);
        model.addAttribute("user", user);
        return "/user/updateForm";
    }

    @PutMapping(value = "/{id}")
    public String update(final @PathVariable Long id, final User newUser) {
        final User user = userRepository.findOne(id);
        user.update(newUser);
        userRepository.save(user);
        return "redirect:/users";
    }
}