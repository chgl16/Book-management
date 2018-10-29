package xyz.cglzwz.service;

import xyz.cglzwz.domain.User;

/**
 * 用户管理业务
 *
 * @author chgl16
 * @date 2018-10-28 18:57
 * @version 1.0
 */

public interface UserService {
    /**
     * 判断用户是否已注册
     *
     * @param user
     * @return
     */
    public boolean isRegister(User user);

    /**
     * 用户登录业务方法，判读账号信息是否正确
     *
     * @param user
     * @return
     */
    public boolean isCorrectPassword(User user);
}
