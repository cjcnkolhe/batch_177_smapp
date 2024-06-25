package edu.cjc.sma.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String onLogin(@RequestParam("username") String username,
			@RequestParam("password") String password,Model m)
	{
		 if(username.equals("ADMIN") && password.equals("ADMIN")) {
			 return "adminscreen";
		 }
		 else {
			 m.addAttribute("login_fail","invalid creadtial...");
			 return "login";
		 }
	}
	
}
