package com.example.orgmanager.controller;

import com.example.orgmanager.entity.Student;
import com.example.orgmanager.model.ResultModel;
import com.example.orgmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * StudentController加上@RequestMapping
 * StudentController现在处理所有/student 请求
* */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    /**
     * @RequestMapping("test")中的"test"不加/
     * */
    @RequestMapping("test")
    public String test(){
        return "Hello, SpringBoot~"+studentService.test();
    }

    /**
     * RequestMapping("all") 不要加/，目前这种写法处理的url是student/all
     * @return 返回所有的student数据
     */
    @RequestMapping("all")
    public ResultModel all() {
        return studentService.queryAll();
    }

    @RequestMapping("query")
    public ResultModel queryById(Integer id) {
        return studentService.queryById(id);
    }


    @RequestMapping("insert")
    public ResultModel insertStudent(Student student) {
        return studentService.insertStudent(student);
    }

    @RequestMapping("update/name")
    public ResultModel updateStudentNameById(Student student) {
        return studentService.updateStudentNameById(student);
    }

    @RequestMapping("update/phone")
    public ResultModel updateStudentPhoneById(Student student) {
        return studentService.updateStudentPhoneById(student);
    }

    @RequestMapping("delete")
    public ResultModel deleteById(Integer id) {
        return studentService.deleteById(id);
    }

    @RequestMapping("update")
    public ResultModel updateById(Student student) {
        return studentService.updateById(student);
    }


}
