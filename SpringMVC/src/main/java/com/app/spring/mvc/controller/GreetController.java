package com.app.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.spring.mvc.model.Employee;
import com.app.spring.mvc.model.RootResponse;

@Controller
@RequestMapping(value="/root/")
public class GreetController {
	
//    @RequestMapping(value= "/greet/{name}",method=RequestMethod.GET)
	@GetMapping(value="/greet/{name}")
    public String greet(@PathVariable String name, ModelMap model){
		    	String greet =" Hello !!! greet - path : " + name + " How are You?";
		    	model.addAttribute("greet", greet);
		    	System.out.println(greet);
    	return "home";
    }
	
	
	@GetMapping(value="/greet/hello")
    public String greet123(ModelMap model){
		    	String greet =" Hello !!! greet-hello :  " + "" + " How are You?";
		    	model.addAttribute("greet", greet);
		    	System.out.println(greet);
    	return "home";
    }
    
    @RequestMapping(value= "/home",method=RequestMethod.GET)
    public String home(@RequestParam(name="uName",required=false) String userName, ModelMap model){
		    	String greet =" Hello !!!"+userName+" How are You?";
		    	model.addAttribute("greet", greet);
		    	System.out.println(greet);
    	return "home";
    }
    
    
    @RequestMapping(value= "/register",method=RequestMethod.POST)
    //@PostMapping(value= "/register")
    public String register(@ModelAttribute("employee") Employee employee,ModelMap model){
		    	String greet =" Hello !!! How are You?";
		    	List<Employee> employeeList = new ArrayList();
		    	employeeList.add(employee);
		    	employeeList.add(employee);
		    	
		    	
		    	model.addAttribute("greet", greet);
		    	
		    	RootResponse rootResponse = new RootResponse();
		    	rootResponse.setStatusCode("200");
		    	rootResponse.setStatusMessage("Success");
		    	rootResponse.setResponse(employeeList);
		    	
		    	model.addAttribute("resp", rootResponse);
		    	System.out.println(greet);
    	return "home";
    }
}