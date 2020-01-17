package com.twodogegg.springboot.commons.autoconfigure;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @title:
 * @author: twodogegg
 * @fileName: KApplicationProperties
 * @dateTime: 2020/01/17 15:52
 * @description:
 **/
@Getter
@Setter
@Configuration
@ConfigurationProperties("im")
public class ApplicationProperties {
    private TestConfig testConfig;

    @Getter
    @Setter
    public static class TestConfig {
        private String name;
    }
}
