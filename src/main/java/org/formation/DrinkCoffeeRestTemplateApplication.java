package org.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class DrinkCoffeeRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkCoffeeRestTemplateApplication.class, args);
	}

	
//	@Bean
//	RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//	
	
}
