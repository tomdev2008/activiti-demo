package com.activiti.demo.web.actions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Index {
     

	@RequestMapping(value = "index", method = { RequestMethod.GET, RequestMethod.POST })
	public String userIndex(HttpServletRequest request) {
		return "index";
	}
}
