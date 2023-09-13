package com.example.testtaskrest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping
    public String getString() {
        return "main";
    }
}
