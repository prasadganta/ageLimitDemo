package com.suren.ageLimit.ageLimitDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suren.ageLimit.ageLimitDemo.service.AgeLimitCheckService;


@RestController
public class AgeCheckController {
	
	
	@Autowired
	private AgeLimitCheckService agelmtCheck;
	
	
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	
	@RequestMapping(value="/agecheck", method=RequestMethod.GET, produces = "application/json")
	public  String ageCheck(@RequestParam("age") int age,@RequestParam("name") String name) {
				
		
		String ageMsg=agelmtCheck.ageLimitValidation(age);
		
		return "Hi "+name+"  "+ ageMsg;
		
	}

}
