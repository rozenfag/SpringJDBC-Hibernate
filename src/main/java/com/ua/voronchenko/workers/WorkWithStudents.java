package com.ua.voronchenko.workers;

import com.ua.voronchenko.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.ua.voronchenko.dao.StudentsDao;

/**
 * Created by kirill on 15.03.15.
 */
public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;

    public void insertIntoStudent(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)) {
            studentsDao.addStudent(student);
            System.out.println("Student has been saved!" + student);
        }else{
            System.out.println("Error in your input data!");
        }
    }

    public Student getStudentById(int id){
        return studentsDao.getStudentById(id);
    }

}
