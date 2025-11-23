package com.abc.boardver52;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.abc.boardver52.model.dao")
public class Boardver52Application {
    public static void main(String[] args) {
        SpringApplication.run(Boardver52Application.class, args);
    }
}