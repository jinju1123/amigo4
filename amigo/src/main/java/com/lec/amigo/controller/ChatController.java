package com.lec.amigo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChatController {
	
	@RequestMapping(value = "/chat.do", method = { RequestMethod.GET })
	public String chat (HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("안녕하세요!");
		
		return "chat/chat.jsp";
	}
	
	@RequestMapping(value = "/chat/createChat.do", method = { RequestMethod.GET })
	public String createChat (HttpServletRequest req, HttpServletResponse resp) {
		
		String name = req.getParameter("name");
		
		
		
		
		
		return "my_chat_list.jsp";
	}
	
}
