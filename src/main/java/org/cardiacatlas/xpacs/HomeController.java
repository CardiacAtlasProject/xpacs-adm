package org.cardiacatlas.xpacs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value={"/", "/home"})
	public String getHomePage() {
		return "Welcome to XPACS Admin Tool";
	}
	
}
