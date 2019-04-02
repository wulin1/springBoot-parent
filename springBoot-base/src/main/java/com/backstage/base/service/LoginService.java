package com.backstage.base.service;

import com.backstage.base.models.PageDo;
import com.backstage.base.models.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface LoginService {
    /**
     * 登录
     * @param user
     */
    List<Object> findlogin(User user);

}
