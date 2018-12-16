package com.baizhi.controller;

import com.baizhi.entity.TestUser;
import com.baizhi.mapper.UserMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
@Log4j/*程序中直接打印log.info(),log.debug()即可*/
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/test")
    public String test(){
        List<TestUser> testUsers = userMapper.selectAll();
        return "index";
    }
}



