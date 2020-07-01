package com.manning.live.cakefactory.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manning.live.cakefactory.service.CatalogService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/catalog")
public class CatalogController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CatalogController.class);

	private String application = "Cake Factory Catalog Controller";

	@Autowired
	private CatalogService catalogService;

	@GetMapping
	public String catalogPage(Model model) {
		log.info("CatalogController ----> homePage start");
		model.addAttribute("items", catalogService.getAllItem());
		model.addAttribute("itemsdb", catalogService.getAllItemDB());
		model.addAttribute("itemsrepo", catalogService.getAllItemByRepo());
		log.info("CatalogController ----> homePage ends");
		return "catalog";
	}

}
