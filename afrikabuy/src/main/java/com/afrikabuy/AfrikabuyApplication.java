package com.afrikabuy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@ComponentScan(basePackages="com.afrikabuy.controllers")
@EntityScan("com.afrikabuy.entities")
@EnableJpaRepositories("com.afrikabuy.repositories")*/

public class AfrikabuyApplication { 

	public static void main(String[] args) {
		SpringApplication.run(AfrikabuyApplication.class, args);
		
	
		
	}
}
