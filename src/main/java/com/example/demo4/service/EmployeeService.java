package com.example.demo4.service;

import com.example.demo4.model.Employee;

import java.util.List;


public interface EmployeeService {
    Employee getEmployeeById(long id);

    List<Employee> getAllEmployees();
}
