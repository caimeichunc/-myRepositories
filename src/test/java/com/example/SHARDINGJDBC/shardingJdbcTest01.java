package com.example.SHARDINGJDBC;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.SHARDINGJDBC.entity.Course;
import com.example.SHARDINGJDBC.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class shardingJdbcTest01 {

    @Autowired
    private CourseMapper courseMapper;

        @Test
       public void contextLoads() {

                Course course = new Course();
                course.setCname("ccc");
                course.setCstatus("Normal");
                course.setUserId(100L);
                for (int i=0;i<10;i++) {
                    courseMapper.insert(course);
                }
        }

        @Test
        public  void  findById(){

            List<Course> courses = courseMapper.selectList(new LambdaQueryWrapper<Course>().eq(Course::getCid, 500730034789548032L));
            int count = courseMapper.delete(new LambdaQueryWrapper<Course>().eq(Course::getCstatus, "Normal"));
            System.out.println(courses);
            System.out.println(count);


        }

        @Test
        public  void  update(){
            Course course = new Course();
            course.setCname("hello");
            course.setCstatus("yes");
            int ccc = courseMapper.update(course, new LambdaQueryWrapper<Course>().eq(Course::getCname, "cmc"));
            System.out.println(ccc);
        }



}
