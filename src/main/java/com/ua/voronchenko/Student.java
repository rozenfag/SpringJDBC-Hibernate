package com.ua.voronchenko;

public class Student {
    private int studentId;
    private String pib;
    private int course;

    public Student(String pib,int course){
        this.pib =  pib;
        this.course = course;
    }

    public Student(){

    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studebtId) {
        this.studentId = studebtId;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String toString(){
        return this.studentId + " " + this.pib + " " + this.course;
    }
}
