/**
 * Controller Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-visit SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 2/6/2022
 */

package com.springbootcore.springbootcore.controller;

import com.springbootcore.springbootcore.serviceimpl.SpringBootCoreServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SpringBootCoreController {


	private final SpringBootCoreServiceImpl springBootCoreService;

	public SpringBootCoreController(SpringBootCoreServiceImpl springBootCoreService) {
		super();
		this.springBootCoreService = springBootCoreService;
	}

	@GetMapping(value = {"", "/", " ", "/springbootcore"})
	public String handleRequests( Model model) {

		model.addAttribute("projectDetails", springBootCoreService.getSpringCoreBeanDetails(1L));

		return "projectDetails";
	}
}
