package com.springDemo_pract;




import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWordController {
//	create a method to display HTML form
	
	@RequestMapping("/displayform")
	public String dispalyForm() {
		
		return "student-form";  
				
	
	}
//	create another method to process the hTML form
	@RequestMapping("/processForm")
public String processForm() {
	
	return "outcome-form";
}
	
//	a new controller method from data 
//	and add data to model
	@RequestMapping("/processFormVerTwo")
	public String makeAJoyfulNoice(@RequestParam ("studentName") String myName, Model model) {
		
		 
//		read the request parameter from the HTMl form
//		String myName = request.getParameter("studentName");
		
				
   //convert to uppercase
		 myName = myName.toUpperCase();
		 
//		 create the message
		 String result = "Yo! "  +  myName;
		 
//		 
		 model.addAttribute("message", result);
		 
		 
				return "outcome-form";
	}
	 
	
	@RequestMapping("/processFormVerJoo")
	public String succesfullProcess(@RequestParam("studentName") String myName,
			
			Model model , Locale locale) {
		
		
//		read the request parameter from the HTMl form
	
				
   //convert to uppercase
		 myName = myName.toUpperCase();
		 
//		 create the message
		 String result = "Hurray!! "  +  myName;
//		 Date date = new Date();
//		 DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//			String formattedDate = dateFormat.format(date);
//			
//			model.addAttribute(formattedDate, result);
//		 
 		 model.addAttribute("message", result);
		 
		 
				return "outcome-form";
	}
 
}
