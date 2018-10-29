package xyz.cglzwz.controller;

import org.apache.ibatis.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.cglzwz.domain.User;
import xyz.cglzwz.service.UserService;

/**
 * 用户登录控制器
 *
 * @author chgl16
 * @date 2018-10-28 23:31
 * @version 1.0
 */

@Controller
public class LoginController {
    private final Logger log = Logger.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam String username, @RequestParam String password) {
        user.setUsername(username);
        user.setPassword(password);
        if (userService.isRegister(user)) {
            // 已经注册
            log.info("用户" + username + "已经注册，可以登录");
            if (userService.isCorrectPassword(user)) {
                // 密码正确
                log.info("密码正确, 正在登录....");
                // 会跳转到index.jsp (配置了url视图配置器)
                return "index";
            } else {
                log.info("密码错误");
                return "errorPassword";
            }
        } else {
            log.info("用户" + username + "尚未注册");
            return "errorNoRegistered";
        }
    }
}
