package com.project.sistema_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.project.sistema_web.model")
@EnableJpaRepositories(basePackages = "com.project.sistema_web.repository")
@ComponentScan(basePackages = "com.project.sistema_web")

public class SistemaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaWebApplication.class, args);
	}

}
