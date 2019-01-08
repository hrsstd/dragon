package com.huilong.cloud.dragon.controller;

import com.huilong.cloud.dragon.util.ResponseUtil;

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
public class HomeController {

    @GetMapping("/")
    public String home(){

        return ResponseUtil.success();

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
