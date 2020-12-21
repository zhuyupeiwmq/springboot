package com.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
		applicationContext.getBean("");
		new Thread(new Runnable() {
			@Override
			public void run() {

			}
		}).start();
	}

}
