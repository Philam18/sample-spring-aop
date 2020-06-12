package com.example.demo2;

import com.example.demo2.service.ShapeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:com/example/demo2/applicationContext.xml")
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);

		shapeService.getCircle().setString("random string ok?");

		// System.out.println(shapeService.getCircle().getName());
		// System.out.println(shapeService.getTriangle().getName());
	}

}
