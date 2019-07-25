package com.kangswx.springbootmybatisplusshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kangswx.springbootmybatisplusshardingjdbc.mapper")
public class SpringbootMybatisplusShardingjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisplusShardingjdbcApplication.class, args);
    }

}
