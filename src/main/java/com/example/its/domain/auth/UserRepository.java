package com.example.its.domain.auth;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserRepository {

    @Select("select * from users where username = #{username}")
    Optional<User> findByUsername(String username);

    @Select("select * from users")
    List<User> findAll();

    @Insert("insert into users (username, password, authority) values (#{username}, #{password}, #{authority})")
    void insert(String username, String password, String authority);

}
