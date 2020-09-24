package com.example.orgmanager.entity;

import java.util.Date;

public class EnterModel {
    private Enter enter;
    private Student student;
    private Course course;

    public EnterModel() {
    }

    public EnterModel(Enter enter, Student student, Course course) {
        this.enter = enter;
        this.student = student;
        this.course = course;
    }

    @Override
    public String toString() {
        return "EnterModel{" +
                "enter=" + enter +
                ", student=" + student +
                ", course=" + course +
                '}';
    }

    public Enter getEnter() {
        return enter;
    }

    public void setEnter(Enter enter) {
        this.enter = enter;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    //    private Integer sid;    // 查询学生表
//    private Integer cid;    // 查询学科表
//    private Integer tid;    // 查询教师表
}
