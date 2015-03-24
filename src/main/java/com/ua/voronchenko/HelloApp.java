package com.ua.voronchenko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ua.voronchenko.entity.Teacher;
import com.ua.voronchenko.workers.WorkWithTeacher;

import java.util.Date;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher.setBirthDate(new Date());
        teacher = workWithTeacher.addTeacher(teacher);
        workWithTeacher.saveTacher(teacher);
    }
}
