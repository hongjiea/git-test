package com.example.orgmanager.mapper;


import com.example.orgmanager.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

//    @Select 注解相当于去执行SELECT命令

    @Select("SELECT NOW()")
    String test();

    /*
    * 查询
    * */
    @Select("SELECT * FROM student")
    List<Student> queryAll();

    //绑定参数
    @Select("SELECT * FROM student where id=#{id}")
    Student queryById(Integer id);

    /**
     * 增
     * */
    @Insert("INSERT INTO student VALUES(null,#{sname},#{phone})")
    void insertStudent(Student student);

    /**
     * 改
     * */
    @Update("UPDATE student SET sname=#{sname} WHERE id = #{id}")
    void updateStudentNameById(Student student);

    @Update("UPDATE student SET phone=#{phone} WHERE id = #{id}")
    void updateStudentPhoneById(Student student);

    /**
     * 删
     * */
    @Delete("DELETE FROM student WHERE id = #{id}")
    void deleteById(Integer id);


}
