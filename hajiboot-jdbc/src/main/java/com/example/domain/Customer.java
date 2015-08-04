package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
<<<<<<< HEAD
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private Object id;
	private String firstName;
	private String lastName;
=======
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Customer {
	private int id;
	private String first_name;
	private String last_name;
>>>>>>> branch 'master' of https://redrebel@github.com/redrebel/hajiboot.git
}
