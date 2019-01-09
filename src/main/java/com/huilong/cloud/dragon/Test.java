package com.huilong.cloud.dragon;

import com.huilong.cloud.dragon.model.UsersPO;
import com.huilong.cloud.dragon.proxy.DragonInvocationHandler;
import com.huilong.cloud.dragon.service.UsersService;
import com.huilong.cloud.dragon.service.impl.UserServiceNoDaoImpl;
import com.huilong.cloud.dragon.service.impl.UsersServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author zhanghuilong
 * @desc
 * @since 2018/11/08
 */
public class Test {

    public static void main(String[] args) {

        UsersService usersService = (UsersService)Proxy
            .newProxyInstance(Thread.currentThread().getContextClassLoader(), UsersServiceImpl.class.getInterfaces(),
                new UserInvocationHandler(new UserServiceImpl()));

        usersService.findById(1L);
    }




}

 class UserInvocationHandler implements InvocationHandler{

     private Object object;

     public UserInvocationHandler(Object object) {
         this.object = object;
     }

     @Override
     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

         System.out.println(" 调用实际 before方法");
           Object o =  method.invoke(object, args);

         System.out.println(" 调用实际 after方法");
         return o;
     }
 }

class UserServiceImpl implements UsersService {
    @Override
    public UsersPO findById(Long id) {
        System.out.println(" 调用实际方法");

        return null;
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
        return null;
    }

    @Override
    public String getProperties() {
        return null;
    }
}
