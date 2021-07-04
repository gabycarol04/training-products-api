package com.consultec.training.products.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private String id;

	private String name;

	private String description;

	private ArrayList<String> features; // TODO: programar a la interfaz y no a la clase concreta. cambiar a List.

}
