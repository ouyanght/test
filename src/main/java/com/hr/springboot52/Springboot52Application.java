package com.hr.springboot52;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;

@SpringBootApplication
@MapperScan("com.hr.springboot52.dao")
@Cacheable
public class Springboot52Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot52Application.class, args);
    }

}
