package com.tcs.test;

import com.tcs.mapper.PeopleMapper;
import com.tcs.mapper.StudentMapper;
import com.tcs.mapper.TeacherMapper;
import com.tcs.pojo.People;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sqlSession.openSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List list = mapper.selAll1();
        System.out.println(list.toString());
        session.close();
//        System.out.println(list.toString());
//        SqlSession session1 = sqlSession.openSession();
//        StudentMapper mapper1 = session1.getMapper(StudentMapper.class);
//        List list1 = mapper1.selAll();
//        session.close();
//        System.out.println(list1.toString());
    }
}
