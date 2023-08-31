package com.web.java.spintboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class SpringbootApplication {

	public static void main(String[] args) {
	//initialize an arrayList
	List<Integer> v0 = new ArrayList<Integer>();
	List<Integer> v1 = null;

	Integer[] a = {1,2,3,4,5};
	v1 = new ArrayList<>(Arrays.asList(a));

	}

}