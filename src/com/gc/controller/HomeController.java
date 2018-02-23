package com.gc.controller;

import java.util.ArrayList;

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
	// this method call will process the data from the form and push it back to the
	// success.jsp
	public ModelAndView registerSuccess(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName,
			@RequestParam("gender") String gender, @RequestParam("phone") String phone,
			@RequestParam("favorites") String checkbox, Model model) { // added model to be able to pass my arraylist in
																		// later

		Person p = new Person(firstName, lastName, phone, gender, checkbox.split(","));

		String sayHello = "Hello, " + p.getFirstName() + " " + p.getGender() + " " + p.getFavorites()[0];

		// Example showing ArrayList push to front end using JSTL to loop through
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Antonella", "Solomon", "313.555.1212", "female", "Decaf,Mocha".split(",")));
		personList.add(new Person("Cara", "Test", "313.555.3312", "female", "Decaf,Chocolate".split(",")));
		personList.add(new Person("James", "test2", "313.553.1212", "male", "Marshmallows,Mocha".split(",")));
		personList.add(new Person("Ron", "Test3", "313.545.1212", "male", "Decaf,Mocha".split(",")));
		personList.add(new Person("Zach", "Test4", "313.655.1215", "female", "Decaf,Mocha".split(",")));
		personList.add(new Person("Ben", "Test5", "313.555.1212", "male", "Decaf,Regular".split(",")));
		model.addAttribute("pList", personList); // this is used to pass the arraylist into the jsp page

		// first parameter : the name of the jsp
		// second parameter : name of the EL tag variable name
		// third parameter : object or data that should go back into our jsp page
		return new ModelAndView("success", "helloMsg", sayHello);
	}
}
