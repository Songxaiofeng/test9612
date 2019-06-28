/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StudentConttrol
 * Author:   1
 * Date:     2019/6/9 17:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 1
 * @create 2019/6/9
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class StudentConttrol {
    @GetMapping

    public String selectUser(){

        return  "zhangsan ";
    }

    @PostMapping
  public String addUser( String username){

        return  username;

    }

}
