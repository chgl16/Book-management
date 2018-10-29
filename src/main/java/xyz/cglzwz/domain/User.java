package xyz.cglzwz.domain;

import org.springframework.stereotype.Component;

/**
 * User用户pojo
 *
 * @author chgl16
 * @date 2018-10-28 16:24
 * @version 1.0
 */
@Component
public class User {
    private int id;
    private String username;
    private String password;
    private boolean flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "user: [id: " + id + ", username: " + username + ", password: " +
                password + ", flag: " + flag + "]";
    }
}
