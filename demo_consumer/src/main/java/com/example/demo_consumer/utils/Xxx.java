package com.example.demo_consumer.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: demo_consumer
 * @Package com.example.demo_consumer.utils
 * @Description:
 * @date 2020/2/28 星期五 00:25
 */
@Component
public class Xxx {
    @Value("${ah}")
    private String ah;

    public void setAh(String ah) {
        this.ah = ah;
    }
    public String getAh(){
        return ah;
    }
}
