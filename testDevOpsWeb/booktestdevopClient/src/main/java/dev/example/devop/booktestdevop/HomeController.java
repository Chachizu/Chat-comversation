package dev.example.devop.booktestdevop;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHome() {
		
		return "books/home.html";
	}

	

}