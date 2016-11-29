package com.ssoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LeeSoohoon
 */
@Controller
public class WelcomeController {

    @GetMapping(value = "/helloworld")
    public String welcome(final String name, final int age, final Model model) {
        System.out.println("name: " + name + " age: " + age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "welcome";
    }
}
