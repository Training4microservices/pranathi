package com.training.springboot.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
@Document(collection = "employee")
public class Employee {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    @Size(min=4, message="Name should have atleast 4 characters")
    String name;
    private Double salary;


    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        Double salary = null;
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}