package com.intercom.cib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication()
public class CibApplication {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(CibApplication.class, args);
		for(String s:apc.getBeanDefinitionNames()){
			System.out.println(s);
		}

		SpringApplication.run(CibApplication.class, args);

	}

}
