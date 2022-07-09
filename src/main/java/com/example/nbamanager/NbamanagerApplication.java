package com.example.nbamanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.nbamanager.mapper")
public class NbamanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbamanagerApplication.class, args);
    }

}
