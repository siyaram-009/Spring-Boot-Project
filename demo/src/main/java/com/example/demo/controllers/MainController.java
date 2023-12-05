package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String greet() {
        System.out.println("Jai ho");
        return "index.jsp";
    }
}
