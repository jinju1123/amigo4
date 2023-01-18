package com.lec.amigo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dogDAO")
public class DogDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
}
