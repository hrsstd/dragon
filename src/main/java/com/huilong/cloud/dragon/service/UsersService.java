package com.huilong.cloud.dragon.service;

import com.huilong.cloud.dragon.model.UsersPO;

import java.util.List;

/**
 * @author zhanghuilong
 * @desc
 * @since 2018/11/11
 */
public interface UsersService {

    UsersPO findById(Long id);

    List<UsersPO> listByName(String name);

    UsersPO login(String phoneNo, String loginPwd);

    Boolean add(UsersPO usersPO);

    Boolean update(UsersPO usersPO);

    Boolean delete(Integer id);

    String getProperties();

}
