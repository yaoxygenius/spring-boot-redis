package yaoxygenius.springbootredis.serviceutil;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yaoxygenius.springbootredis.bean.RedisSerializerPojo;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class RedisUtilTest {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
        this.redisUtil.addKey("key1", new RedisSerializerPojo(), 10, TimeUnit.MINUTES);
        String value1 = (String) this.redisUtil.getValue("key1");
        System.out.println(value1);
    }
}