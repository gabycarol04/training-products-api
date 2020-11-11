package com.bgeneral.training.products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping(value = "/test")
	public String test() {

		return "Siempre Listos 2020";
	}

}
