package com.bradstrausbaugh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // inherits from @Component
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		
		return "main-menu";  // /WEB-INF/view/main-menu.jsp
		
	}
	
}
