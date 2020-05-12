package com.suren.ageLimit.ageLimitDemo.service;

import org.springframework.stereotype.Component;

@Component("AgeLimitCheckService")
public class AgeLimitCheckService {
	
	public String ageLimitValidation(int age) {
		
		
		   if(age>15) {
			   return "you are eligible to smoke!!!";
		   }else if(age <15) {
			   return "you are not eligible to smoke!!!";
		   }else {
			   return "Invalid age!!!";
		   }
		
		
	}

}
