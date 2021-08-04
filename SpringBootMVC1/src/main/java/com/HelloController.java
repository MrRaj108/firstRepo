package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController{

	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
	  System.out.println("Welome to the Spring Controller");
	  return "Welome to the Spring Controller";
	}
	
	
	
	@RequestMapping("coder")
	@ResponseBody
	public Coder getCoder() {
		
		Coder c1= new Coder();
		c1.setCid(108);
		c1.setCname("Raj");
		c1.setTech("AI");
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
			return c1;
			
		}
	
	
	
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		System.out.println("Welcome to My Web Page....HTML");
		
		return "welcome.html";
	}
	
	
	
}
