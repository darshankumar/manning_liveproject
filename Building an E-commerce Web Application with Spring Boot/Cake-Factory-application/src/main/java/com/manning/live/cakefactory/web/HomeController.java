package com.manning.live.cakefactory.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HomeController.class);
	
	private String application = "Cake Factory Application Controller";
	
	@GetMapping
	public String homePage(Model model) {
		log.info("HomeController ----> homePage start");
		model.addAttribute("title", application);
		log.info("HomeController ----> homePage ends");
		return "home";
	}

}
