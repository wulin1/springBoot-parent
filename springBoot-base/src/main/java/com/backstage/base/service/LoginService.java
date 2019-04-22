package com.backstage.base.service;

import com.backstage.base.models.User;
import org.springframework.transaction.annotation.Transactional;



@Transactional
public interface LoginService {
    /**
     * 登录
     * @param user
     */
    int findlogin(User user);

}
