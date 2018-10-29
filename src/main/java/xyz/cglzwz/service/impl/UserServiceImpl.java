package xyz.cglzwz.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.cglzwz.dao.UserMapper;
import xyz.cglzwz.domain.User;
import xyz.cglzwz.service.UserService;

import org.springframework.stereotype.Service;

/**
 * 实现用户的业务逻辑
 *
 * @author chgl16
 * @date 2018-10-28 19:05
 * @version 1.0
 */

@Service("userSevice")
public class UserServiceImpl implements UserService {
    private final Logger log = Logger.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean isRegister(User user) {
        log.info("开始验证用户是否已注册");
        Integer id = userMapper.findUserIdWithUsername(user.getUsername());
        if (id != null && id > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isCorrectPassword(User user) {
        log.info("开始验证用户密码是否正确");
        Integer id = userMapper.findUserIdWithUsernameAndPassword(user.getUsername(), user.getPassword());
        if (id != null && id > 0) {
            return true;
        }
        return false;
    }
}
