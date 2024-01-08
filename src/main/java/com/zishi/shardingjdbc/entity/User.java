package com.zishi.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_user")
public class User {
    private Integer id;

    private String nickname;

    private String password;

    private Integer sex;

    private String birthday;
}