package com.example.MortgageApplicationService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@OpenAPIDefinition(
		info = @Info(title = "Mortgage Application Service",description = "API ипотечных заявок", version = "1.0")
)

@SpringBootApplication
public class MortgageApplicationServiceApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MortgageApplicationServiceApp.class, args);
	}

}
