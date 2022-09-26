package com.example.demo.test;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/26
 */

import com.example.demo.entity.Users;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *@Auther 月鸟石 2022/9/26
 *联系方式(QQ)：3054578922
 *周一 
 *欢迎回家，主人
 */
@SpringBootTest
public class ServiceTest {


    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void test01() {

        List<Users> list = new ArrayList<>();
        for (int i = 2; i < 8;i++) {
            Users user = new Users(
                    (long) i,
                    "lpl",
                    30 + i,
                    "2" + i + "@qq.com"
            );
            list.add(user);
        }
        boolean b = userServiceImpl.saveBatch(list);
        System.out.println(b);
    }
}

/**
 *一切顺心
 */