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

import com.springbootcore.springbootcore.entity.SpringBootCoreDetails;
import com.springbootcore.springbootcore.serviceimpl.SpringBootCoreServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringBootCoreController {


	private final SpringBootCoreServiceImpl springBootCoreService;

	public SpringBootCoreController(SpringBootCoreServiceImpl springBootCoreService) {
		super();
		this.springBootCoreService = springBootCoreService;
	}

	@GetMapping(value = {"", "/", " ", "/springbootcore", "/springbootcore/api"})
	public String handleRequests(Model model) {

		model.addAttribute("projectDetails", springBootCoreService.getSpringCoreBeanDetails(1L));

		return "projectDetails";
	}

	@GetMapping("/springbootcore/api/update/{id}")
	public String showUpdateDetailsPage(@PathVariable Long id, Model model) {
		model.addAttribute("details", springBootCoreService.getSpringCoreBeanDetails(id));
		return "updateprojectdetails";
	}

	@PostMapping("/springbootcore/api/{id}")
	public String updateStudentDetails(@PathVariable Long id, @ModelAttribute("details") SpringBootCoreDetails springBootCoreDetailsNew) {

		SpringBootCoreDetails springBootCoreDetails = new SpringBootCoreDetails();
		springBootCoreDetails.setId(springBootCoreDetailsNew.getId());
		springBootCoreDetails.setProjectName(springBootCoreDetailsNew.getProjectName());
		springBootCoreDetails.setProjectStartDate(springBootCoreDetailsNew.getProjectStartDate());
		springBootCoreDetails.setProjectDescription(springBootCoreDetailsNew.getProjectDescription());
		springBootCoreDetails.setProjectLanguage(springBootCoreDetailsNew.getProjectLanguage());
		springBootCoreDetails.setProjectFramework(springBootCoreDetailsNew.getProjectFramework());

		springBootCoreService.updateProjectDetails(springBootCoreDetails); // Update

		return "redirect:/springbootcore/api"; // redirect to index
	}
}