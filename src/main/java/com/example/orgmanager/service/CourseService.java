package com.example.orgmanager.service;

import com.example.orgmanager.entity.Course;
import com.example.orgmanager.mapper.CourseMapper;
import com.example.orgmanager.model.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public ResultModel updateById(Course course) {
        ResultModel rm = new ResultModel();
        // 先查询是否有此条数据
        Course query = courseMapper.queryById(course.getCid());
        if (query == null) {
            rm.setCode("500");
            rm.setMessage("无此条数据");
            return rm;
        }
        // 判断传入的参数name以及price是否为空
        if (course.getCname() != null) {
            courseMapper.updateCourseNameById(course);
        }
        if (course.getPrice() != null) {
            courseMapper.updateCoursePriceById(course);
        }
        rm.setMessage("修改数据成功");
        return rm;
    }

    public ResultModel insertCourse(Course course) {
        ResultModel rm = new ResultModel();
        courseMapper.insertCourse(course);
        rm.setMessage("插入课程成功");
        return rm;
    }

    public ResultModel deleteById(Integer cid) {
        ResultModel rm = new ResultModel();
        // 先查询是否有此条数据
        Course query = courseMapper.queryById(cid);
        if (query == null) {
            rm.setCode("500");
            rm.setMessage("无此条数据");
            return rm;
        }
        courseMapper.deleteById(cid);
        rm.setMessage("删除数据成功");
        return rm;
    }

    public ResultModel queryById(Integer cid) {
        ResultModel rm = new ResultModel();
        Course query = courseMapper.queryById(cid);
        if(query == null) {
            rm.setCode("500");
            rm.setMessage("无此条数据");
            return rm;
        }
        rm.setMessage("查询成功");
        rm.setData(query);
        return rm;
    }

    public ResultModel queryAll() {
        ResultModel rm = new ResultModel();
        rm.setData(courseMapper.queryAll());
        rm.setMessage("查询成功");
        return rm;
    }
}
