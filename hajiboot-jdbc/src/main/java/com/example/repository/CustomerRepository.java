package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Customer;

@Repository
@Transactional
public class CustomerRepository {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	private static final RowMapper<Customer> customerRowMapper = (rs, i) -> {
		Integer id = rs.getInt("id");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		return new Customer(id,firstName, lastName);
	};
	
	public List<Customer> findAll(){
		List<Customer> customers = jdbcTemplate.query("SELECT id, first_name, last_name FROM customers ORDER BY id", 
				customerRowMapper);
		return customers;
	}
	
	public Customer findOne(Integer customerId){
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		return jdbcTemplate.queryForObject("SELECT id, first_name, last_name FROM customers WHERE id=:id", 
				param, customerRowMapper);
	}
	
	public Customer save(Customer customer){
		SqlParameterSource param = new BeanPropertyParameterSource
	}
	
	public void delete(Integer customerId){
		customerMap.remove(customerId);
	}
}
