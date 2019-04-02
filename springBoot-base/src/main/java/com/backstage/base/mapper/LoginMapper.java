package com.backstage.base.mapper;

import com.backstage.base.models.PageDo;
import com.backstage.base.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {
    /**
     * 登录
     * @param user
     */
    List<Object> findlogin(User user);
}
