package com.example.orgmanager.service;


import com.example.orgmanager.entity.Course;
import com.example.orgmanager.entity.Enter;
import com.example.orgmanager.entity.EnterModel;
import com.example.orgmanager.entity.Student;
import com.example.orgmanager.mapper.CourseMapper;
import com.example.orgmanager.mapper.EnterMapper;
import com.example.orgmanager.mapper.StudentMapper;
import com.example.orgmanager.model.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EnterService {
    @Autowired
    private EnterMapper enterMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private CourseMapper courseMapper;

    public ResultModel query() {
        ResultModel rm = new ResultModel();
        rm.setData(enterMapper.query());
        rm.setMessage("查询成功");
        return rm;
    }

    public ResultModel delete(Integer eid) {
        ResultModel rm = new ResultModel();
        enterMapper.deleteById(eid);
        rm.setMessage("删除成功");
        return rm;
    }

    public ResultModel all() {
        ResultModel rm = new ResultModel();
        List<Enter> enterList = enterMapper.query();
        List<EnterModel> list = new ArrayList<>();
        for (Enter enter:enterList) {
            Course course = courseMapper.queryById(enter.getCid());
            Student student = studentMapper.queryById(enter.getSid());
            list.add(new EnterModel(enter, student, course));
        }
        rm.setData(list);
        rm.setMessage("查询所有数据成功");
        return rm;
    }
    public ResultModel insert(Enter enter) {
        ResultModel rm = new ResultModel();
        enter.setEntertime(new Date());
        enterMapper.insert(enter);
        rm.setMessage("数据插入成功");
        return rm;
    }
}
