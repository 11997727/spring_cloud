package com.example.demo_provider.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: demo_provider
 * @Package com.example.demo_provider.mapper
 * @Description:
 * @date 2020/2/28 星期五 10:42
 */
@Mapper
public interface UserMapper {
    Integer selectUserCount();
}
