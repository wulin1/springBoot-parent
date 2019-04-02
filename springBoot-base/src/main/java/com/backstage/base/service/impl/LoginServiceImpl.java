package com.backstage.base.service.impl;

import com.backstage.base.mapper.LoginMapper;

import com.backstage.base.models.User;
import com.backstage.base.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;
    @Override
    public List<Object> findlogin(User user) {

        return loginMapper.findlogin(user);
    }
}
