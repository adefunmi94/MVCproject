package com.springDemo_pract;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomoController {
	
//	define a controller method
	
	@RequestMapping("/")
	public String displayPage() {
		
		return "main-menu";
	}

}
 