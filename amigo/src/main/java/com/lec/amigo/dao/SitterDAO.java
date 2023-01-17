package com.lec.amigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lec.amigo.chat.JDBCUtility.JDBCUtility;
import com.lec.amigo.vo.ChatVO;
import com.lec.amigo.vo.SitApplyVO;
import com.lec.amigo.vo.SitApplyVO;

@Repository
public class SitterDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<SitApplyVO> getSitAppList(int index){      // 펫시터 지원을 위한 값 리스트
		
		List<SitApplyVO> sitAppList = new ArrayList<SitApplyVO>();
		Connection conn = JDBCUtility.getConnection();
		String sql = ""; // 테이블에서 인조키(인덱스)인 펫시터번호 갖고옴
		                          // sitAppMapper 하고 똑같은 기능아닌가? 로우맵이면?
		ResultSet rs =null;       // 어차피 추가되는데? 아닌가? 여긴 ?
		PreparedStatement pstmt=null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, index);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				SitApplyVO sit = new SitApplyVO();
				
				//sit.setSitNo(rs.getInt("sit_no"));
				//sit.setUserNo(rs.getInt("user_no"));
				/*   2023 / 01  /  17  VO에 테이블조인 및 들어오는값들은 어떻게처리?
				 * Yes, the code above is a Java class that implements the "RowMapper" 
				 * interface, which is used to map rows of data from a JDBC ResultSet 
				 * to an object. The class maps data from a ResultSet to a "SitApplyVO"
				 *  object, which is a Java object that represents a pet sitter's information. 
				 *  The mapRow() method is called for each row in the ResultSet and maps
				 *   the columns of the ResultSet to the fields of the SitApplyVO object,
				 *    which is then returned. So this code is intended to add pet sitter's 
				 *    data into the database when the query is executed.
				 *    However, if the information is already stored in the "members" table and the application 
				 *    doesn't need to store the same information in the pet sitter table 
				 *    then it would be unnecessary to include these values in the SitApplyVO object.
				->중요 It might be a good idea to double check the database design and the requirements 
					   of the application to see if these values are actually necessary.*/
			
				sit.setSitPhoto(rs.getString("sit_photo"));
				sit.setSitName(rs.getString("user_name"));             // 자동 입력
				sit.setSitGender(rs.getString("sit_gender"));
				sit.setSitBirth(rs.getString("sit_birth"));
				sit.setSitPhone(rs.getString("user_phone"));            // 자동 입력
				sit.setSitGender(rs.getString("user_addr"));             // 자동 입력
				sit.setSitSmoking(rs.getBoolean("sit_smoking"));
				sit.setSitJob(rs.getString("sit_job"));
				sit.setSitDays(rs.getString("sit_days"));
				sit.setSitTime(rs.getString("sit_time"));
				sit.setSitExp(rs.getBoolean("sit_exp"));
				sit.setSitCareExp(rs.getString("sit_care_exp"));
				sit.setSitIntro(rs.getString("sit_intro"));
				
				//sit.setSitAuthIs(rs.getBoolean("sit_auth_is"));
				
				sitAppList.add(sit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, rs, pstmt);
		}
		return sitAppList;
	}
	// 회원번호 회원vo, 펫시터지원vo,
/*	public int insertSitter(int index, SitApplyVO sitApplyVO, boolean sitAuthIs) {
			// int index, String gender, String birth, boolean smoking, String job, String days, String time, boolean exp, 
			// String sit_care_exp, String intro, String photo, boolean auth ) 
		
		//첨에신청:0 허락= 1 허락전에는 0.
		{
			String sql = "insert into petsitter(sit_no, user_no, sit_gender, sit_birth, sit_smoking, sit_job, sit_days, sit_time, sit_exp, sit_care_exp, sit_intro, sit_photo, sit_auth_is) "
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
			Connection conn = JDBCUtility.getConnection();
			PreparedStatement pstmt = null;
			int row=0;
			
			String sit_auth_is = (SitApplyVO.ge)
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,  );
			} catch (Exception e) {
				// TODO: handle exception
			}
	}*/
			
}
