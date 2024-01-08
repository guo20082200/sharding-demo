package com.zishi.shardingjdbc.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String nickname;

    private String password;

    private Integer sex;

    private String birthday;
}