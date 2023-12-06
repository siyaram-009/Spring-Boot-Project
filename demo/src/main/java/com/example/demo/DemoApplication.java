package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.controllers"})
//@ComponentScan("com.example.demo.src.main.resources.templates.webapp.WEB-INF.pages")
//@ComponentScan("C:/Users\Siyaram\Downloads\demo\demo\src\main\resources\templates\webapp\WEB-INF\pages")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
