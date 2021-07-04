package com.consultec.training.products.controller;

import com.consultec.training.products.model.Account;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping(value = "/test")
	public String test() {

		return "Siempre Listos Junio 2021";
	}

	@GetMapping(value = "/accounts")
	public ArrayList<Account> getAccounts() {

		// Crear account1

		Account account1 = new Account();
		account1.setId("1001");
		account1.setName("Tu primera Cuenta de Ahorros");
		account1.setDescription("100% digital");

		ArrayList<String> features1 = new ArrayList<>(); // Java 7 no hace falta colocar el tipo

		features1.add("Ábrela en el app solo con tu cédula");
		features1.add("Nacionales y extranjeros con cédula E");

		account1.setFeatures(features1);

		// Crear account2

		Account account2 = new Account("1002", "Cuenta Mis Ahorros", "Desde pequeños aprendamos el valor de ahorrar",
				new ArrayList<>());

		// ArrayList<String> features2 = new ArrayList<>(); // Java 7 no hace falta
		// colocar el tipo
		ArrayList<String> features2 = account2.getFeatures();

		features2.add("Exclusiva para menores de edad");
		features2.add("Atractivas tasas de interés");

		// account2.setFeatures(features2);

		// Agregar las cuentas a la lista

		ArrayList<Account> accounts = new ArrayList<Account>();

		accounts.add(account1);
		accounts.add(account2);

		return accounts;
	}

}
