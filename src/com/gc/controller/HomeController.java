package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.model.Person;

/*
 * @author: Antonella Solomon
 *
 */

@Controller

public class HomeController {

	@RequestMapping("/welcome")
	public String registerForm(Model model) {
		model.addAttribute("caraTest", "testing this out");

		// this page view has the form in it
		return "register";
	}

	@RequestMapping(value = "success", method = RequestMethod.POST)
	// this method call will process the data from the form and push it back to the success.jsp
	public ModelAndView registerSuccess(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName,
			@RequestParam("gender") String gender, @RequestParam("phone") String phone,
			@RequestParam("favorites") String checkbox) {

		Person p = new Person(firstName, lastName, phone, gender, checkbox.split(","));

		String sayHello = "Hello, " + p.getFirstName() + " " + p.getGender() + " " + p.getFavorites()[0];
		// first parameter : the name of the jsp
		// second parameter : name of the EL tag variable name
		// third parameter : object or data that should go back into our jsp page

		return new ModelAndView("success", "helloMsg", sayHello);
	}
}
