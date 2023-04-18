package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(description = "Employee Application"))
public class EmployeeMgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMgtApplication.class, args);
	}

}
