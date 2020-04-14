package it.chen.service;

import it.chen.domain.User;
import it.chen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService  {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){

        return userMapper.findAll();
    }

    public User find(Long id){

        return this.userMapper.find(id);
    }
}
