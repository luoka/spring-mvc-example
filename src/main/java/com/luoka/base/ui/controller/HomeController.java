package com.luoka.base.ui.controller;

import com.luoka.base.model.user.IUserAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private IUserAdminService userAdminService;
	
	public void setUserAdminService(IUserAdminService userAdminService){
		this.userAdminService = userAdminService;
	}

	@RequestMapping(value={"","/"})
	public String index(Model model){
		System.out.println("====================================");
		model.addAttribute("total", this.userAdminService.total());
		return "index";
	}
}
