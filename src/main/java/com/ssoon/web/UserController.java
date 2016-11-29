package com.ssoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LeeSoohoon
 */
@Controller
public class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping(value = "/create")
    public String create(final User user) {
        System.out.println("user: " + user);
        users.add(user);
        return "redirect:/list";
    }

    @GetMapping(value = "/list")
    public String list(final Model model) {
        model.addAttribute("users", users);
        return "list";
    }
}