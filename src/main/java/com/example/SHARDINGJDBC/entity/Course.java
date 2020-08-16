package com.example.SHARDINGJDBC.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Course {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid")
    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
