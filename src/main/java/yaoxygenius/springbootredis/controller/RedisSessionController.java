package yaoxygenius.springbootredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * redis-session
 * time:2020/5/19
 * author:yaoxygenius
 */
@RestController
public class RedisSessionController {

    @GetMapping("/put/test")
    public Map<String, Object> testSessionId(HttpServletRequest request) {
        Map<String, Object> sessionIdPortMap = new HashMap<String, Object>();
        // 获取session信息
        sessionIdPortMap.put("sessionId：", request.getSession().getId());
        sessionIdPortMap.put("服务器端口：", request.getServerPort());
        // 向session中保存用户信息 key规则： user + "_" + uid
        request.getSession().setAttribute("user_1", "{uid:1,username:zs@qq.com}");
        return sessionIdPortMap;
    }

    @GetMapping("/get/test")
    public Map<String, Object> getTestSessionId(HttpServletRequest request) {
        Map<String, Object> sessionIdPortMap = new HashMap<String, Object>();
        // 获取session信息
        sessionIdPortMap.put("sessionId：", request.getSession().getId());
        sessionIdPortMap.put("服务器端口：", request.getServerPort());
        // 向session中保存用户信息 key规则： user + "_" + uid
        sessionIdPortMap.put("session中value", request.getSession().getAttribute("user_1"));
        return sessionIdPortMap;
    }
}
