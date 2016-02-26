package com.SpringMVC.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: GettingStartedOn.com
 * 
 */
 
@Controller
public class HelloWorld {
 
	@RequestMapping("/HelloMVC")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3> Message from HellWorld.java-- GettingStartedOn.com-- **********</div><br><br>";
		return new ModelAndView("Hello", "message", message);
	}
}
