package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {

	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHTML() {
		
		 StringBuffer sb = new StringBuffer();
		    sb.append("<!DOCTYPE html>");
		    sb.append("<html>");
		    sb.append("<head>");
		    sb.append("<title>Welcome Page</title>");
		    sb.append("</head>");
		    sb.append("<body>");
		    sb.append("<h1>Hello, Welcome to My Page!</h1>");
		    sb.append("<p>This is a sample HTML response from a Spring Boot controller.</p>");
		    sb.append("</body>");
		    sb.append("</html>");
		    return sb.toString();
		
	
	}
	
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
	
}
