package com.ua.voronchenko.dao;


import com.ua.voronchenko.entity.Teacher;

/**
 * Created by kirill on 17.03.15.
 */
public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
