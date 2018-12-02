package com.example.demo4.repository;


import com.example.demo4.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
