package com.denzel.udemyspring.cruddemo.dao;

import com.denzel.udemyspring.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
