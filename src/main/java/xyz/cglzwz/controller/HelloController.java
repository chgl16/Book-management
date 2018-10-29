package xyz.cglzwz.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import xyz.cglzwz.domain.User;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.mvc.Controller;

/**
 * 必须声明为@Controller声明为@Component不行，因为这样会找不到对应的分发器
 */
@Controller
public class HelloController {
    private final Logger log = Logger.getLogger(this.getClass());
    @Autowired
    private User user;
    /*
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

    } */

    /**
     * 这样写了参数列表，请求的url中只有/hello?username=xxx&password=xxxx
     * 才可以运行这个类，如果只是/hello，爆400
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param username
     * @param password
     * @throws IOException
     */
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestParam("username") String username, @RequestParam("password") String password) throws IOException {
        user.setUsername(username);
        user.setPassword(httpServletRequest.getParameter("password"));
        log.info(user.toString());
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write("{\"json\": \"hello world\"}");
    }
}
