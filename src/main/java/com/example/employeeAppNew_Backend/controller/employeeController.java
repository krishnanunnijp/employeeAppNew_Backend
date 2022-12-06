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
        return "add employee page";
    }
    @GetMapping("/search")
    public String search() {
        return "welcome to search employee page";
    }
    @GetMapping("/view")
    public String view() {
        return "welcome to view employee page";
    }
    @GetMapping("/edit")
    public String edit() {
        return "welcome to edit employee page";
    }
    @GetMapping("/delete")
    public String delete() {
        return "welcome to delete employee page";
    }
}
