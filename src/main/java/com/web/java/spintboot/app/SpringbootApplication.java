package com.web.java.spintboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class SpringbootApplication {

	public static void main(String[] args) {
		String reverse = "Hello World";
		System.out.println(reverseString(reverse));


		SpringApplication.run(SpringbootApplication.class, args);
	}


//calling function recursively


	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		// Calling Function Recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}





















}
