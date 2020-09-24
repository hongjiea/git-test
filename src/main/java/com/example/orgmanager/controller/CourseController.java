package com.example.orgmanager.controller;


import com.example.orgmanager.entity.Course;
import com.example.orgmanager.model.ResultModel;
import com.example.orgmanager.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("all")
    public ResultModel queryAll() {
        return courseService.queryAll();
    }
    @RequestMapping("query")
    public ResultModel queryByCid(Integer cid) {
        return courseService.queryById(cid);
    }

    @RequestMapping("update")
    public ResultModel updateCnameByCid(Course course) {
        return courseService.updateById(course);
    }

    @RequestMapping("insert")
    public ResultModel insert(Course course) {
        return courseService.insertCourse(course);
    }

    @RequestMapping("delete")
    public ResultModel delete(Integer cid) {
        return courseService.deleteById(cid);
    }

}
