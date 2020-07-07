package com.manning.live.cakefactory.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manning.live.cakefactory.domain.Item;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/basket")
public class BasketController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BasketController.class);

	private String application = "Cake Factory Catalog Controller";

	private List<Item> list;

	
	@PostMapping("/add")
	public String addItem(Item item) {
		log.info("CatalogController ----> homePage start");
		System.out.println(item);
		return "catalog";
	}
	
	@PostMapping("/delete")
	public String deleteItem(Item item) {
		log.info("CatalogController ----> homePage start");
		System.out.println(item);
		return "catalog";
	}
	

}
