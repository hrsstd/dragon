package com.huilong.cloud.dragon.controller;

import com.huilong.cloud.dragon.service.UsersService;
import com.huilong.cloud.dragon.util.ResponseUtil;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghuilong
 * @desc
 * @since 2018/11/06
 */
@RestController
@RequestMapping("/api")
@PropertySource("classpath:config/other.properties")
public class HomeController {
    @Value("${spring.datasource.type}")
    private String datasourceType;

    @Value("${name}")
    private String name;

    @Resource
    private UsersService usersService;

    @GetMapping("/type")
    public String home(){
        String properties = usersService.getProperties();
        return ResponseUtil.success("cotroller:"+datasourceType+" service:"+properties+" name:"+name);

    }

    @RequestMapping("/list")
    public String list(){
        return "list";
    }

    @RequestMapping("/find")
    public String find(){
        return "find";
    }

    @RequestMapping("/get/{id}/")
    public String getById(){
        return "get";
    }

    @RequestMapping("/get")
    public String get(){
        return "get";
    }
}
