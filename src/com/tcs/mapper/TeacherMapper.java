package com.tcs.mapper;

import com.tcs.pojo.Teacher;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    public Teacher selById(int id);

    public List selAll();
//    Results中也符合AutoMapping特性   能自动映射的Result可以不写
    @Results(value = {@Result(id=true,column = "id",property = "id"),@Result(property = "name",column = "name"),@Result(column = "id",property = "stuList",many = @Many(select = "com.tcs.mapper.StudentMapper.selByTid"))})
    @Select("select * from teacher")
    public List<Teacher> selAll1();
}
