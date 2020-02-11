package com.springDemo_pract;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	
	
	@RequestMapping("/displayform")
	public String displayTheForm() {
		
		return "Hi Silly Bae";
	}

}
