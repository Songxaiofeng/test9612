/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserControl1
 * Author:   1
 * Date:     2019/6/9 17:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.control;

import com.beans.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Description;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 1
 * @create 2019/6/9
 * @since 1.0.0
 */
@RestController
@RequestMapping("/userControl")
@Validated
public class UserControl1 {
    @GetMapping
    public User test1(){
        return new User("张三",2);
    }

    @PostMapping
    public User test2(@Email  User user , BindingResult result){

        if(!result.hasErrors()){
                System.out.println("信息错误");
        }
        return  user;
    }

    @Email
    @PutMapping
    @Description("这是一个putMapping 的名字描述")
    public String test55( String name ){
        /*if(error.hasErrors()){
            System.out.println("参数不匹配 ，请输入email格式");
            return "信息输入错误";
        }*/
        return name;
    }


    //@ConfigurationProperties(prefex="user")
   // @ConfigurationProperties(prefix = "user")
    @RequestMapping("/h")
    public  User test66(){
        User user  = new User();
        return user;
    }

}
