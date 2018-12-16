package com.baizhi;

import com.baizhi.entity.TestUser;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {
    @Autowired
    UserMapper userMapper;
    
    @Test
    public void test1() {
        List<TestUser> testUsers = userMapper.selectAll();
        for (TestUser testUser : testUsers) {
            System.out.println(testUser);
        }
    }


}

