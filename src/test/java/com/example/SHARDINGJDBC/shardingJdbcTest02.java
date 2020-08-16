package com.example.SHARDINGJDBC;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.SHARDINGJDBC.entity.Course;
import com.example.SHARDINGJDBC.mapper.CourseMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class shardingJdbcTest02 {

     @Autowired
   private CourseMapper courseMapper;


     @Test
    public  void add(){
         Course course = new Course();
         course.setUserId(504L);
         course.setCstatus("yes");
         course.setCname("sss");
         courseMapper.insert(course);
     }

     @Test
     public  void  select(){
         Course course = courseMapper.selectById(1294915070247653377L);
         log.info("selectById---->{}",course);
         List<Course> courses = courseMapper.selectList(new LambdaQueryWrapper<Course>().eq(Course::getUserId, 200L).eq(Course::getCid,1294914674217242625L));
         log.info("selectList---->{}",courses);
     }

     @Test
     public  void  update(){
         Course course = new Course();
         course.setCid(1294914674217242625L);
         course.setUserId(400l);
         course.setCstatus("ok");
         //m1  course_2
         int count = courseMapper.update(course, new LambdaQueryWrapper<Course>().eq(Course::getUserId, 300L).eq(Course::getCid,1294914674217242625L));

         log.info("count---->{}",count);

     }

     @Test
     public  void  delete(){
         //m1  course_2
         int count = courseMapper.delete(new LambdaQueryWrapper<Course>().eq(Course::getUserId, 400L).eq(Course::getCid, 1294914674217242625L));
         log.info("count---->{}",count);
     }

}
