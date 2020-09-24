package com.example.orgmanager.service;

import com.example.orgmanager.entity.Student;
import com.example.orgmanager.mapper.StudentMapper;
import com.example.orgmanager.model.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;


    public String test() {
        return studentMapper.test();
    }
    /*
    * 返回所有student数据
    * */
    /**
     * @return 返回所有的student数据
     */
    public ResultModel queryAll() {
        ResultModel rm = new ResultModel();
        rm.setMessage("查询所有数据成功");
        rm.setData(studentMapper.queryAll());
        return rm;
    }

    public ResultModel queryById(Integer id) {
        ResultModel rm = new ResultModel();
        Student student = studentMapper.queryById(id);
        if (student == null) {
            rm.setCode("500");
            rm.setMessage("没有此条数据");
            return rm;
        }
        rm.setMessage("查询数据成功");
        rm.setData(student);
        return rm;
    }

    public ResultModel insertStudent(Student student) {
        // 在此应该进行验证，如电话是否重复
        ResultModel rm = new ResultModel();
        studentMapper.insertStudent(student);
        rm.setMessage("插入数据成功");
        return rm;
    }

    public ResultModel updateStudentNameById(Student student) {
        Student query = studentMapper.queryById(student.getId());
        ResultModel rm = new ResultModel();
        if (query == null) {
            rm.setCode("500");
            rm.setMessage("没有此条数据");
            return rm;
        }
        studentMapper.updateStudentNameById(student);
        rm.setMessage("修改名字成功");
        return rm;
    }

    public ResultModel updateStudentPhoneById(Student student) {
        Student query = studentMapper.queryById(student.getId());
        ResultModel rm = new ResultModel();
        if (query == null) {
            rm.setCode("500");
            rm.setMessage("没有此条数据");
            return rm;
        }
        studentMapper.updateStudentPhoneById(student);
        rm.setMessage("修改电话成功");
        return rm;
    }

    public ResultModel deleteById(Integer id) {
        Student student = studentMapper.queryById(id);
        ResultModel rm = new ResultModel();
        if (student == null) {
            rm.setCode("500");
            rm.setMessage("没有此条数据");
            return rm;
        }
        studentMapper.deleteById(id);
        rm.setMessage("删除数据成功");
        return rm;
    }

    public ResultModel updateById(Student student) {
        Student query = studentMapper.queryById(student.getId());
        ResultModel rm = new ResultModel();
        if (query == null) {
            rm.setCode("500");
            rm.setMessage("没有此条数据");
            return rm;
        }
        if (student.getPhone() != null && student.getPhone().length()>0) {
            studentMapper.updateStudentPhoneById(student);
        }
        if (student.getSname() != null && student.getSname().length()>0) {
            studentMapper.updateStudentNameById(student);
        }
        rm.setMessage("修改信息成功");
        return rm;
    }




}
