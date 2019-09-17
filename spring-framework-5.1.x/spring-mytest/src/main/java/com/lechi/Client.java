package com.lechi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Client
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/9/16 21:59
 * @Version 1.0
 **/

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Hello.class);
		OutPut output = (OutPut) context.getBean("helloworld");

		output.helloworld();

		System.out.println("hello git");
	}
}
