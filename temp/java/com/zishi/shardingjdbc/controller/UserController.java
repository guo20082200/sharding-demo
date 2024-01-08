package com.zishi.shardingjdbc.controller;

import com.zishi.shardingjdbc.entity.User;
import com.zishi.shardingjdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/save")
    public String addUser() {
        User user = new User();
        user.setId(1);
        user.setNickname("zhangsan" + new Random().nextInt());
        user.setPassword("123456");
        user.setSex(1);
        user.setBirthday("1997-12-03");
        userMapper.addUser(user);
        return "success";
    }

    @Transactional
    @PostMapping("/update")
    public String updateUser() {
        User userById = userMapper.findUsersById(1);
        userById.setId(2);
        userMapper.addUser(userById);
        User userById2 = userMapper.findUsersById(2);
        System.out.println(userById2.getNickname());
        userMapper.updateNicknameById("xxxxxxxxxx",2);
        User userById3 = userMapper.findUsersById(2);
        System.out.println(userById3.getNickname());
        return "success";
    }

    @GetMapping("/findUsers")
    public List<User> findUsers() {
        return userMapper.findUsers();
    }
}