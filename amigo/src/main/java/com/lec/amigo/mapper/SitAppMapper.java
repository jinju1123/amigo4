package com.lec.amigo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lec.amigo.vo.SitterVO;         // 펫시터 정보가 row단위로 db에 쌓이도록??
											// JDBC 템플릿이  있어야 됨.
public class SitAppMapper implements RowMapper<SitterVO>{

	@Override
	public SitterVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		SitterVO sitter = new SitterVO();
		
		sitter.setSit_no(rs.getInt("sit_no"));                        
		sitter.setUser_no(rs.getInt("user_no"));                       
		sitter.setSit_gender(rs.getString("sit_gender"));      
		sitter.setSit_birth(rs.getString("sit_birth"));        
		sitter.setSit_smoking(rs.getBoolean("sit_smoking"));   
		sitter.setSit_job(rs.getString("sit_job"));            
		sitter.setSit_days(rs.getString("sit_days"));          
		sitter.setSit_time(rs.getString("sit_time"));          
		sitter.setSit_exp(rs.getBoolean("sit_exp"));           
		sitter.setSit_care_exp(rs.getString("sit_care_exp"));  
		sitter.setSit_intro(rs.getString("sit_intro"));        
		sitter.setSit_photo(rs.getString("sit_photo"));        
		
		
		
		return sitter;
	}

	
}
