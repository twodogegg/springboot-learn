package com.twodogegg.springboot.controller;

import com.twodogegg.springboot.commons.autoconfigure.ApplicationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @title:
 * @author: twodogegg
 * @fileName: Index
 * @dateTime: 2020/01/17 14:04
 * @description:
 **/
@RestController
@RequestMapping("")
public class Index {

    @Resource
    private ApplicationProperties.TestConfig testConfig;


    @RequestMapping("")
    public String index () {
        return testConfig.getName();
    }
}
