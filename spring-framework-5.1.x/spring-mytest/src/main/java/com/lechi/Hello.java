package com.lechi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName Hello
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/9/16 22:05
 * @Version 1.0
 **/
@Configuration
public class Hello {

	@Bean(name = "helloworld")
	public OutPut impl(){
		return new OutPutImpl();
	}
}
