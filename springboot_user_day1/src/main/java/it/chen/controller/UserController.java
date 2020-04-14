package it.chen.controller;

import it.chen.domain.User;
import it.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @GetMapping("findall")
    public String findAll(){

        return "Hello";
    }

    @ResponseBody
    @GetMapping("{id}")
    public User findbyid(@PathVariable("id") Long id){

        return userService.find(id);
    }

}
