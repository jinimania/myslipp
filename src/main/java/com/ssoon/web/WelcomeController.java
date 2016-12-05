package com.ssoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author LeeSoohoon
 */
@Controller
public class WelcomeController {

    @GetMapping(value = "/helloworld")
    public String welcome(final Model model) {
        final List<MyModel> repo = Arrays.asList(new MyModel("ssoon"), new MyModel("jinimania"));
        model.addAttribute("repo", repo);
        return "welcome";
    }
}
