package me.DJ1TJOO.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

	@GetMapping("/")
	public String rootView() {
		return "index";
	}
	
}
