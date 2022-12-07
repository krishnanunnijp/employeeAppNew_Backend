package com.example.employeeAppNew_Backend.dao;

import com.example.employeeAppNew_Backend.model.employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface employeeDao extends CrudRepository<employee, Integer> {
    @Query(value="SELECT `id`, `company_name`, `designation`, `employee_code`, `mobile_number`, `name`, `password`, `salary`, `user_name` FROM `employee` WHERE `employee_code`= :employeeCode",nativeQuery = true)
    List<employee> searchEmployees(@Param("employeeCode") Integer employeeCode);
}
