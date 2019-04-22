package com.backstage.api.controller;

import com.backstage.base.exception.XPFBadRequestException;
import com.backstage.base.models.User;
import com.backstage.base.response.XPFSingleResponse;
import com.backstage.base.service.LoginService;

import org.apache.commons.lang.StringUtils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class LoginController {
    @Resource
    private LoginService loginService;
    @GetMapping(value = "/findloginById")
    @ResponseBody
    public  Object findloginById(@RequestBody User user) throws XPFBadRequestException
    {
        if (user != null) {
            if(StringUtils.isBlank(user.getName())){
                return new XPFSingleResponse("用户名不能为空");
            }
            if(StringUtils.isBlank(user.getPassword())){
                return new XPFSingleResponse("密码不能为空");
            }
                if(loginService.findlogin(user) > 0){
                    return new XPFSingleResponse("登录成功");
                }
        }
                 return new XPFSingleResponse("登录失败");
    }


}
