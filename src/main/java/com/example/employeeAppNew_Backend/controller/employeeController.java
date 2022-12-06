package com.example.employeeAppNew_Backend.controller;

import com.example.employeeAppNew_Backend.dao.employeeDao;
import com.example.employeeAppNew_Backend.model.employee;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeeController {
    @GetMapping("/")
    public String welcome() {
        return "welcome to welcome page";
    }
@Autowired
    private employeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/add")
    public String add(@RequestBody employee e) {
        dao.save(e);
        return "add employee page";
    }
    @GetMapping("/search")
    public String search() {
        return "welcome to search employee page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<employee> view() {
        return (List<employee>) dao.findAll();
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
