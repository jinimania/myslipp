package com.ssoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LeeSoohoon
 */
@Controller
public class HomeController {
    @GetMapping(value = "")
    public String home() {
        return "index";
    }
}
