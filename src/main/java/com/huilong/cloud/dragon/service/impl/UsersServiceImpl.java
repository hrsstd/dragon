package com.huilong.cloud.dragon.service.impl;

import com.huilong.cloud.dragon.dao.UsersDAO;
import com.huilong.cloud.dragon.model.UsersPO;
import com.huilong.cloud.dragon.service.UsersService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author zhanghuilong
 * @desc
 * @since 2018/11/11
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Value("${spring.datasource.type}")
    private String datasourceType;

    @Resource
    private UsersDAO usersDAO;

    @Override
    public UsersPO findById(Long id) {
        UsersPO usersPO = usersDAO.get(id);
        return usersPO;
    }

    @Override
    public List<UsersPO> listByName(String name) {

        List<UsersPO> usersPOList = usersDAO.listByName(name);

        return usersPOList;
    }

    @Override
    public UsersPO login(String phoneNo, String loginPwd) {
        UsersPO usersPO = usersDAO.login(phoneNo, loginPwd);
        return usersPO;
    }

    @Override
    public Boolean add(UsersPO usersPO) {
        int result = usersDAO.insert(usersPO);
        return result >0 ? true :false;
    }

    @Override
    public Boolean update(UsersPO usersPO) {
        int result = usersDAO.update(usersPO);
        return result >0 ? true :false;
    }

    @Override
    public Boolean delete(Integer id) {
        int result = usersDAO.delete(id);
        return result >0 ? true :false;
    }

    @Override
    public String getProperties() {

        return datasourceType;
    }

}
