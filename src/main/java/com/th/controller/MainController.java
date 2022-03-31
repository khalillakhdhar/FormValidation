package com.th.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.th.model.Person;
import com.th.model.PersonRepository;

@Controller
public class MainController {
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("")
	public String showAddPersonForm(Model model) {
	Person p=new Person();
		model.addAttribute("person",p);
		return "add";
	}
	@PostMapping("/add")
	public String addPerson(@Valid Person person, BindingResult result, Model
	model) {
	if (result.hasErrors()) {
	return "add";
	}
	else
	{
		personRepository.save(person);
		return "redirect:/";
	}
	}
//	repository.save(person);
//	return "redirect:/index";
}
