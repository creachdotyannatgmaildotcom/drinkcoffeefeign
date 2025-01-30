package org.formation.controller;

import org.formation.client.CoffeeClient;
import org.formation.dto.CoffeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@RestController
public class EmployeeGetCoffeeController {
	
	private CoffeeClient client;
	
	
	@GetMapping("drink/{id}")
	public ResponseEntity<CoffeeDto> getById(@PathVariable Long id) {

		ResponseEntity<CoffeeDto> coffee = client.getCoffeeById(id);
		log.info("=>"+coffee);
		return coffee;
	}
	
	

}
