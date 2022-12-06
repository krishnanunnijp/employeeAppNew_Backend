package com.example.employeeAppNew_Backend.controller;

import com.example.employeeAppNew_Backend.model.employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {
    @GetMapping("/")
    public String welcome() {
        return "welcome to welcome page";
    }


    @PostMapping(path = "/add", consumes = "application/json",produces = "application/json")
    public String add(@RequestBody employee e ) {
        System.out.println(e.toString());
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
