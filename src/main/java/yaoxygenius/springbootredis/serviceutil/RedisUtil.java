package yaoxygenius.springbootredis.serviceutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * redis工具类
 * time:2020/5/19
 * author:yaoxygenius
 */
@Service
public class RedisUtil {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    /**
     * 添加字符串KEY
     *
     * @param key      字符串KEY
     * @param value    值 可以为对象
     * @param expire   过期时间
     * @param timeUnit TimeUnit中定义的时间单位
     */
    public void addKey(String key, Object value, long expire, TimeUnit timeUnit) {
        this.redisTemplate.opsForValue().set(key, value, expire, timeUnit);
    }

    /**
     * 根据KEY获取VALUE
     *
     * @param key
     * @return value
     */
    public Object getValue(String key) {
        return this.redisTemplate.opsForValue().get(key);
    }

}
