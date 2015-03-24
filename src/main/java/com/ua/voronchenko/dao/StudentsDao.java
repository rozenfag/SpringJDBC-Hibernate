package com.ua.voronchenko.dao;

import com.ua.voronchenko.Student;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}
