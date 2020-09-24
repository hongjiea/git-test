package com.example.orgmanager.mapper;


import com.example.orgmanager.entity.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Insert("INSERT INTO course VALUES(null,#{cname},#{price})")
    void insertCourse(Course course);

    @Delete("Delete from course where cid=#{cid}")
    void deleteById(Integer cid);

    @Update("UPDATE course SET cname=#{cname} WHERE cid=#{cid}")
    void updateCourseNameById(Course course);

    @Update("UPDATE course SET price=#{price} WHERE cid=#{cid}")
    void updateCoursePriceById(Course course);

    @Select("SELECT * FROM course WHERE cid=#{cid}")
    Course queryById(Integer cid) ;

    @Select("SELECT * FROM course")
    List<Course> queryAll();
}
