package com.alex.restful.controller;

import com.alex.restful.pojo.SysUser;
import com.alex.restful.service.SysUserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/api/sysuser/{id}")
    public String getUserById(@PathVariable("id") Long id) {
        SysUser user = sysUserService.getSysUserById(id);
        return JSON.toJSONString(user);
    }
}
