//step-4
package com.example.springBootbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springBootbackend.model.Employee;

@Repository
//provides hibernate functions like findByID etc thus reducing boilerPlate codes
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}