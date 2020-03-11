package com.example.demo_consumer.controller;

import com.example.demo_consumer.utils.Xxx;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: demo_consumer
 * @Package com.example.demo_consumer.controller
 * @Description: 读取本地配置
 * @date 2020/2/28 星期五 00:02
 */
@RestController
public class TestContrloller {
    @Resource
    private Xxx xxx;

    @RequestMapping("/")
    public String ceshi(){
        return xxx.getAh();
    }
}
