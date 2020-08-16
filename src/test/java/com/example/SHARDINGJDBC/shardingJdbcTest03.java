package com.example.SHARDINGJDBC;


import com.example.SHARDINGJDBC.entity.Userrrr;
import com.example.SHARDINGJDBC.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class shardingJdbcTest03 {

    @Autowired
   private UserMapper userMapper;


     @Test
    public  void add(){
         Userrrr user = new Userrrr();
         user.setUsername("mmm");
         user.setUstatus("success");
         userMapper.insert(user);
     }

     @Test
     public  void  select(){

     }

     @Test
     public  void  update(){


     }

     @Test
     public  void  delete(){

     }

}
