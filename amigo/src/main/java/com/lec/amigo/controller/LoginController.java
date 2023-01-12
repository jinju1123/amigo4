package com.lec.amigo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lec.amigo.dao.ChatDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login.do", method = { RequestMethod.GET })
	public String chat (HttpServletRequest req, HttpSession session) {
		System.out.println(req.getParameter("id")+"확인요");
		
		String id = req.getParameter("id");
		
		ChatDAO dao = new ChatDAO();
		
		int idCheck = 0;
		idCheck = dao.idCheck(id);

		if(idCheck>0) {
			
			req.setAttribute("idCheck", idCheck);
			
			session.setAttribute("idCheck", idCheck);
			session.setAttribute("id", id);
			return "chat/chat.jsp";
		}else {
			session.setAttribute("idCheck", false);
		}
		
		
		return "index.jsp"; 
	}
	
}
