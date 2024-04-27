package com.openlab.biblioteca.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.openlab.biblioteca.service.I18nService;

@Controller
public class HomeController {

	@Autowired
	private I18nService i18nService;

	@RequestMapping("/")
	public String index(Model model, Locale locale) {
		String msn = i18nService.buscarMensagem("index.welcome", locale);
		model.addAttribute("msnBemVindo", msn);
		return "publica-index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}
