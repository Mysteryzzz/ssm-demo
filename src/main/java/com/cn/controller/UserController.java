package com.cn.controller;

import com.alibaba.fastjson.JSON;
import com.cn.domain.User;
import com.cn.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @version: 1.0
 * @author: x.x@hand-china.com
 * @date: 2019/2/21
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private IUserService userService;

    @RequestMapping("showUser")
    public String  toIndex(HttpServletRequest request, Model model)
    {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        Logger.getLogger(JSON.toJSONString(user));
        System.out.println(JSON.toJSONString(user));
        request.getSession().setAttribute("user",user);
        return "showUser";
    }
}
