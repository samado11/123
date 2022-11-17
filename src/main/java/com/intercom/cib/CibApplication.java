package com.intercom.cib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
=======
>>>>>>> 28f7d516b253c2ab3b356b9b7aa65f38eed3263d


@SpringBootApplication()
public class CibApplication {

	public static void main(String[] args) {
<<<<<<< HEAD
		ApplicationContext apc = SpringApplication.run(CibApplication.class, args);
		for(String s:apc.getBeanDefinitionNames()){
			System.out.println(s);
		}
=======
		SpringApplication.run(CibApplication.class, args);
>>>>>>> 28f7d516b253c2ab3b356b9b7aa65f38eed3263d
	}

}
