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
import javax.servlet.http.HttpServletRequest;

public class loginTesetController {

    @RestController
    public class LoginController {
        @Resource
        private LoginService loginService;
        @GetMapping(value = "/findloginById")
        @ResponseBody
        public  void findlogin( HttpServletRequest request){

            String word = request.getParameter("word");
            System.out.println(word);
        }
    }
}
