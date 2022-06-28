package com.app.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.spring.mvc.model.Employee;

@Controller
public class HomeController {
	    @RequestMapping("/")  
	    public ModelAndView showform(){  
	    	 ModelAndView mav = new ModelAndView("index");
	    	    mav.addObject("employee", new Employee());
	    	    return mav;
	    }  
}
