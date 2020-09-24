package com.example.orgmanager.mapper;


import com.example.orgmanager.entity.Enter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EnterMapper {

    @Select("SELECT * FROM enter")
    List<Enter> query();

    @Delete("DELETE FROM enter WHERE eid=#{eid}")
    void deleteById(Integer eid);
    @Insert("INSERT INTO enter VALUES(null, #{sid} ,#{cid} ,#{period} ,#{rebate} ,#{tid} ,#{entertime})")
    void insert(Enter enter);
}
