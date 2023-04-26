package com.dmitryantipin.spring.springboot.spring_data_rest.dao;

import com.dmitryantipin.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//this interface, inherited from the JpaRepository,
//        saves us from having to create several DAO implementations in case
//        we have several different entities in our project
//By using spring-boot-starter-data-rest, spring will automatically create a REST API based on the entity type
//        from the project repository
//        In my case, this will happen on the basis of Employee, modifying it to employees
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
