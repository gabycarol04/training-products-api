package com.bgeneral.training.products.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

	private String id;
	
	private String name;
	
	private String description;

	private ArrayList<Integer> features;	// TODO: programar a la interfaz y no a la clase concreta. cambiar a List.
}
