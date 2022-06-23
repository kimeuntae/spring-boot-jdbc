package com.example.multi.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.multi.admin")  //어노테이션 경로스캔
@MapperScan(basePackages = "com.example.multi.admin.dao") //Mapper 경로스캔
public class AdminAplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminAplication.class, args);
	}
}