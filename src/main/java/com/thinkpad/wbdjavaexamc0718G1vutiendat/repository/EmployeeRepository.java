package com.thinkpad.wbdjavaexamc0718G1vutiendat.repository;


import com.thinkpad.wbdjavaexamc0718G1vutiendat.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    Iterable<Employee> findByNameContaining(String word);
}
