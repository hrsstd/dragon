package com.huilong.cloud.dragon.service.impl;

import com.huilong.cloud.dragon.model.UsersPO;
import com.huilong.cloud.dragon.service.UsersService;

import java.util.List;

/**
 * @author zhanghuilong
 * @desc
 * @since 2018/12/27
 */

public class UserServiceNoDaoImpl implements UsersService {
    @Override
    public UsersPO findById(Long id) {
        return new UsersPO();
    }

    @Override
    public List<UsersPO> listByName(String name) {
        return null;
    }

    @Override
    public UsersPO login(String phoneNo, String loginPwd) {
        return null;
    }

    @Override
    public Boolean add(UsersPO usersPO) {
        return null;
    }

    @Override
    public Boolean update(UsersPO usersPO) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return Boolean.TRUE;
    }

    @Override
    public String getProperties() {
        return null;
    }
}
