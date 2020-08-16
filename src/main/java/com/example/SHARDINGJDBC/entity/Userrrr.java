package com.example.SHARDINGJDBC.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Userrrr {
    @TableId(value = "user_id")
    private Long userId;

    private String username;

    private String ustatus;

}
