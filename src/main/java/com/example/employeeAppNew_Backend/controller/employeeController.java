package com.example.employeeAppNew_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {
    @GetMapping("/")
    public String welcome() {
        return "welcome to welcome page";
    }
    @PostMapping("/add")
    public String add() {
        return "add employee page";
    }
    @PostMapping("/search")
    public String search() {
        return "welcome to search employee page";
    }
    @PostMapping("/view")
    public String view() {
        return "welcome to view employee page";
    }
    @PostMapping("/edit")
    public String edit() {
        return "welcome to edit employee page";
    }
    @PostMapping("/delete")
    public String delete() {
        return "welcome to delete employee page";
    }
}
