package com.thinkpad.wbdjavaexamc0718G1vutiendat.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "group_employee")
public class GroupEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;

    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employees;
    public GroupEmployee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
