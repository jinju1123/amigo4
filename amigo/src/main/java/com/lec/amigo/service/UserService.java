package com.lec.amigo.service;

import javax.servlet.http.HttpServletResponse;

import com.lec.amigo.vo.UserVO;

public interface UserService {

	UserVO getUser(String email);

	public void sendEmail(UserVO vo, String div);
	public void searchPw(HttpServletResponse res, UserVO vo) throws Exception;
	
}
