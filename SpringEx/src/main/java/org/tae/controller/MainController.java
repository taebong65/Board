package org.tae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("mainpage")
	public void main() {
		System.out.println("메인페이지");
	}
	
	@GetMapping("aboutme")
	public void aboutme() {
		System.out.println("자기소개");
	}

}


