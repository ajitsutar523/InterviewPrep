package com.cg;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cg.model.Product;
import com.cg.service.IProductService;

@SpringBootApplication
@ComponentScan(basePackages="com.cg")
public class SpringMvcRestDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestDemo2Application.class, args);
		System.out.println("Strted at 8083");
		
		ApplicationContext context=SpringApplication.run(SpringMvcRestDemo2Application.class, args);
		IProductService service=(IProductService)context.getBean("productService");
		List<Product> pl=service.saveAll();
		System.out.println("Products are added");
	}

}
