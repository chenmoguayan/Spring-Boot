package org.hj.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hj.boot.entity.User;
import org.hj.boot.mapper.UserMapper;
import org.hj.boot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author hj
 * @data 2023/2/24 9:50
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
