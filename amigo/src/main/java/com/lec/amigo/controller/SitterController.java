package com.lec.amigo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lec.amigo.dao.SitterDAO;
import com.lec.amigo.vo.SitterVO;
import com.lec.amigo.vo.UserVO;



@Controller
public class SitterController {
	

	// 시터가입 화면->컨트롤러->서비스->다오
	@RequestMapping(value = "/view/apply/apply_form.do", method = { RequestMethod.POST })
	public String SitApply (SitterVO sittervo, UserVO uservo) {
		
		System.out.println(sittervo.toString());
		
		System.out.println("gggggggggggggggggggggggggggggggggggg");
		
		
		return null;
		
	
	}

}
