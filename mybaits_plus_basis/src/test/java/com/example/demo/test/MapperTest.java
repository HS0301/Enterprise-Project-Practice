package com.example.demo.test;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/26
 */

import com.example.demo.entity.Users;
import com.example.demo.mapper.UsersMapper;
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
public class MapperTest {


    @Autowired
    private UsersMapper usersMapper;


    @Test
    public void test01() {
        List<Users> list = usersMapper.selectList(null);
        list.forEach(System.out :: println);
    }
}

/**
 *一切顺心
 */