package org.hj.boot;

import org.apache.catalina.filters.RemoteIpFilter;
import org.hj.boot.entity.User;
import org.hj.boot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author hj
 * @data 2023/2/24 11:16
 */

@SpringBootTest
public class TestMP {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void addUser() {
        User user = new User();
        user.setName("包子");
        user.setAge(3);
        user.setEmail("baobao@163.com");
        int count = userMapper.insert(user);
        System.out.println(count > 0 ? true : false);
    }

//    @Test
//    public void update() {
//        User user = userMapper.selectById(1l);
//        user.setEmail("666@163.com");
//        int i = userMapper.updateById(user);
//        System.out.println(i);
//    }
    @Test
    public void delete(){
        User user = new User();
        user.setId(1629081202582450178L);
        int i = userMapper.deleteById(user);
        System.out.println("删除条目"+i);
    }

    // 测试乐观锁
//    @Test
//    public void testUpdateUserLocker() {
//        User user = userMapper.selectById(5);
//        user.setName("jerryLocked");
//        int i = userMapper.updateById(user);
//        System.out.println(i);
//    }

//    @Test
//    public void findName() {
//        List<Map<String,Object>> enameAndUName = userMapper.getEnameAndUName();
//        System.out.println(enameAndUName);
//    }
    @Test
    public void findAll() {
        List<User> list = userMapper.selectList(null);
        System.out.println("查询所有");
        list.stream().forEach(System.out::println);
    }
    @Test
    public void testSelectBatch() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1l, 2l, 3l));
        System.out.println("批量查询");
        users.stream().forEach(System.out::println);
    }
    @Test
    public void testDeleteId(){
        int rows = userMapper.deleteById(1629081202582450178l);
        System.out.println("逻辑删除"+rows);
    }
}
