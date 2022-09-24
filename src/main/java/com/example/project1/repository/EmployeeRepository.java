package com.example.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project1.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
