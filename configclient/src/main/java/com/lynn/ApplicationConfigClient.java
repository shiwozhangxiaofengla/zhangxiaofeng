package com.lynn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by 27481 on 2019/4/23.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApplicationConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigClient.class,args);
    }
}
