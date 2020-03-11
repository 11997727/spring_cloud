package com.example.demo_provider.controller;

import com.example.demo_provider.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: demo_provider
 * @Package com.example.demo_provider.controller
 * @Description:读取远程配置
 * @date 2020/2/28 星期五 10:38
 */
@RestController
public class TestController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/")
    public String test(){
       return  userMapper.selectUserCount().toString();
    }
}
