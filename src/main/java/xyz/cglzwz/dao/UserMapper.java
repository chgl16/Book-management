package xyz.cglzwz.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 用户管理映射器接口
 *
 * @author chgl16
 * @date 2018-10-28 19:19
 * @version 1.0
 */

@Repository
public interface UserMapper {
    /**
     * 通过用户名判断用户是否注册
     *
     * @param username
     * @return 已注册返回用户id,未注册返回非自然数
     */
    public Integer findUserIdWithUsername(@Param("username")String username);

    /**
     * 通过账号信息判断是否正确
     *
     * @param username
     * @param password
     * @return 正确返回用户id,密码错误返回非自然数
     */
    public Integer findUserIdWithUsernameAndPassword(@Param("username")String username, @Param("password")String password);
}
