package com.example.employeeAppNew_Backend.dao;

import com.example.employeeAppNew_Backend.model.employee;
import org.springframework.data.repository.CrudRepository;

public interface employeeDao extends CrudRepository<employee, Integer> {
}
