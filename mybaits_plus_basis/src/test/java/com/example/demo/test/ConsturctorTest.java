package com.example.demo.test;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/26
 */

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.demo.entity.Users;
import com.example.demo.mapper.UsersMapper;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 *
 *@Auther 月鸟石 2022/9/26
 *联系方式(QQ)：3054578922
 *周一 
 *欢迎回家，主人
 */
@SpringBootTest
public class ConsturctorTest {


    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void test01() {
        QueryWrapper<Users> q = new QueryWrapper<>();
        q.like("age",2);
        List<Users> list = usersMapper.selectList(q);
        System.out.println(list);
    }



    @Autowired
    private UserServiceImpl serviceImpl;

    @Test
    public void test02() {
        UpdateWrapper<Users> usersMap = new UpdateWrapper<>();
        usersMap.eq("age",21).set("uname","hs");
        System.out.println(serviceImpl.update(usersMap));
    }


}

/**
 *一切顺心
 */