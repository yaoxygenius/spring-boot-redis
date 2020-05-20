package yaoxygenius.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yaoxygenius.springbootredis.service.RedisSerializerService;

/**
 * redis序列化测试
 * time:2020/5/20
 * author:yaoxygenius
 */
@RestController
public class RedisSerializerController {

    @Autowired
    private RedisSerializerService redisSerializerService;

    @GetMapping("/getObject")
    private Object getObject() {
        return redisSerializerService.getRedisSerializer();
    }

    @GetMapping("/getObjectList")
    private Object getObjectList() {
        return redisSerializerService.getRedisSerializerList();
    }
}
