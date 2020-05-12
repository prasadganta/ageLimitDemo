package com.suren.ageLimit.ageLimitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages= "com")
@ComponentScan(basePackages="com")
public class AgeLimitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgeLimitDemoApplication.class, args);
	}

}
