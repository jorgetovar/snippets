package com.jetprogramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jetprogramming.services.LoginService;

@Controller
public class IndexController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String loadIndexPage() {
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String handleLoginRequest(ModelMap model, @RequestParam String name, @RequestParam String password) {
		if (!loginService.isUserValid(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "index";
		}

		model.put("name", name);
		return "welcome";
	}
}
