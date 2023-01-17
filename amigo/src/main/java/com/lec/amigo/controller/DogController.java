package com.lec.amigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lec.amigo.service.DogService;
import com.lec.amigo.vo.DogVO;

@Controller
public class DogController {

	@Autowired
	DogService dogService;
	
	@RequestMapping("getDogList.do")
	public String getDogList(Model model,DogVO dog) {
	List<DogVO> dogList = dogService.getDogList(dog);

	
	model.addAttribute("dogList", dogList);
	return null;
	}
	
	
	@RequestMapping("/insertDog.do")
	public String insertDog(DogVO dog) {
		dogService.insertDog(dog);
		System.out.println("dsad");
		System.out.println(dog.toString());
		return "amigo_profile.jsp";
	}
	
}
