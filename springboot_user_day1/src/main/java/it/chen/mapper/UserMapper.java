package it.chen.mapper;

import it.chen.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper{

    @Select("select * from user")
    public List<User> findAll();
    @Select("select * from user where id = #{id}")
    public User find(Long id);
}
