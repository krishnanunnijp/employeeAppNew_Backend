package com.example.employeeAppNew_Backend.controller;

import com.example.employeeAppNew_Backend.dao.employeeDao;
import com.example.employeeAppNew_Backend.model.employee;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Hashtable;
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
    public HashMap<String,String> add(@RequestBody employee e) {
        HashMap<String,String> map=new HashMap<>();
        dao.save(e);
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<employee> search(@RequestBody employee e) {
        String empcode= String.valueOf(e.getEmployeeCode());
        System.out.println(empcode);
        return (List<employee>) dao.searchEmployees(e.getEmployeeCode());
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
    @CrossOrigin(origins = "*")
    @PostMapping (path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> delete(@RequestBody employee e) {
        String empid=String.valueOf(e.getId());
        System.out.println(empid);
        dao.deleteEmployee(e.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
}
