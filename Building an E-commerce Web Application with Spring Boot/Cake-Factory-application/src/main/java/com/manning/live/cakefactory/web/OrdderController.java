package com.manning.live.cakefactory.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manning.live.cakefactory.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrdderController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(OrdderController.class);

	private String application = "Cake Factory Catalog Controller";

	@Autowired
	// private Basket basket ;

	@GetMapping("/current")
	public String orderForm(@ModelAttribute Order order) {
		return "order";
	}

	@PostMapping
	public String processOrder(Order order) {
		log.info("Order submitted: " + order);
		return "redirect:/";
	}

}
