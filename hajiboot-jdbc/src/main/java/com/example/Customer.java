package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Customer {
	private int id;
	private String first_name;
	private String last_name;
}
