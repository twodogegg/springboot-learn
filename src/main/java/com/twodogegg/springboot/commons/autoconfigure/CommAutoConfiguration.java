package com.twodogegg.springboot.commons.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.twodogegg.springboot.commons.autoconfigure.ApplicationProperties.TestConfig;


/**
 * @title:
 * @author: twodogegg
 * @fileName: CommAutoConfiguration
 * @dateTime: 2020/01/17 18:46
 * @description:
 **/
@Configuration
public class CommAutoConfiguration {
    @Autowired
    private ApplicationProperties config;

    @Bean(name = "testConfig")
    public TestConfig testConfig() {
        TestConfig testConfig = config.getTestConfig();
        return testConfig;
    }
}
