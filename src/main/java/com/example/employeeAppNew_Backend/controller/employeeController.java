package com.example.employeeAppNew_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {
    @GetMapping("/")
    public String welcome() {
        return "welcome to welcome page";
    }
    @GetMapping("/add")
    public String add() {
        return "add page";
    }
}
