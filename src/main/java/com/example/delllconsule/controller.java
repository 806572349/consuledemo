package com.example.delllconsule;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.agent.model.Check;
import com.ecwid.consul.v1.agent.model.Member;
import com.ecwid.consul.v1.agent.model.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * create by Nemo
 * 2018/9/12  10:40
 */
//@ConfigurationProperties(value = "test")
@RestController
public class controller {

    public String name;

    @Autowired
    RedisTemplate redisTemplate;
    @GetMapping
    public  void est(){
        redisTemplate.opsForValue().set("1","2");
    }



    private static Logger log = LoggerFactory.getLogger(controller.class);







}
