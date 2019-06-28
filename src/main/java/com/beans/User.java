/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserControl
 * Author:   1
 * Date:     2019/6/9 17:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import sun.reflect.annotation.TypeAnnotation;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 1
 * @create 2019/6/9
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix="user",ignoreUnknownFields = false)
public class User{
    private String username;
    private  int userid;

    public User() {
    }

    public User(String username, int userid) {
        this.username = username;
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "UserControl{" +
                "username='" + username + '\'' +
                ", userid=" + userid +
                '}';
    }
}
