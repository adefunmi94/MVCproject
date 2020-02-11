package com.springDemo_pract.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	

	
	@GetMapping("/display")
	public String addCustomer( Model theModel) {
		
		 
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
		
	}
	
//	@GetMapping("/test")
//	public String test(Model model) {
//		
//		model.addAttribute("customer", new Customer());
//		return "customer-form";
//	}
	
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("customer") Customer customer) {
		
//		log the input data
		System.out.println("The customer: " + customer.getFirstName() + " " + customer.getLastName() 
		+" " + customer.getUserName() + " " + customer.getPassword() );
		
		return "customer-confirmation";
		
	}

}
