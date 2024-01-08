package com.zishi.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zishi.shardingjdbc.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

/*    @Insert("insert into tb_user(id, nickname,password,sex,birthday) values(#{id},#{nickname},#{password},#{sex},#{birthday})")
    void addUser(User user);

    @Select("select * from tb_user")
    List<User> findUsers();


    @Select("select * from tb_user where  id = #{id}")
    User findUsersById(@Param("id") Integer id);

    @Update("update tb_user set nickname = #{nickname} where  id = #{id}")
    void updateNicknameById(@Param("nickname") String nickname, @Param("id") Integer id);*/
}