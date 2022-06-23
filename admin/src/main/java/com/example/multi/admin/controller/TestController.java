package com.example.multi.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multi.admin.dao.TestMapper;
import com.example.multi.admin.service.TestService;

@RestController
public class TestController {

	@Autowired 
	TestService testService;
	
	@Autowired 
	TestMapper testMapper;
	
	@GetMapping("/test")
	public String test() {
		testService.test();
		System.out.println(testMapper.test());
		return "ok";
	}

//	@GetMapping("/test")
//	public String test() {
//		return "test";
//	}
}
