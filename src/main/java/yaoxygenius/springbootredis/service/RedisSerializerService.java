package yaoxygenius.springbootredis.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import yaoxygenius.springbootredis.bean.RedisSerializerPojo;

import java.util.ArrayList;
import java.util.List;

/**
 * time:2020/5/20
 * author:yaoxygenius
 */
@Service
public class RedisSerializerService {

    @Cacheable(cacheNames = "redisSerializer")
    public RedisSerializerPojo getRedisSerializer() {
        return new RedisSerializerPojo();
    }


    @Cacheable(cacheNames = "redisSerializerList")
    public List<RedisSerializerPojo> getRedisSerializerList() {
        List<RedisSerializerPojo> redisSerializerPojoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            redisSerializerPojoList.add(new RedisSerializerPojo());
        }
        return redisSerializerPojoList;
    }
}
