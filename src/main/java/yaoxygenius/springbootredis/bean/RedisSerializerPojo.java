package yaoxygenius.springbootredis.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * redisSerializer
 * time:2020/5/20
 * author:yaoxygenius
 */
@Data
public class RedisSerializerPojo implements Serializable {

    private String redisIdb = UUID.randomUUID().toString();

    private String myName = "redisSerializer";

    private Date date = new Date();
}
