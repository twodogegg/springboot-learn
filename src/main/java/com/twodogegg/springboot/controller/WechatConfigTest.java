package com.twodogegg.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title:
 * @author: twodogegg
 * @fileName: WechatConfigTest
 * @dateTime: 2020/01/18 00:10
 * @description:
 **/
@RestController
@RequestMapping("wechat/config")
@PropertySource("classpath:wechat-config.properties")
public class WechatConfigTest {
    @Value("${wechat.key}")
    private String wechatKey;

    @RequestMapping
    public String index () {
        return wechatKey;
    }
}
