package com.wang.mybatisnew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.mybatisnew.*.mapper")
public class MybatisnewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisnewApplication.class, args);
	}
}
