package com.vijay.myWebApp1.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.myWebApp1.dao.UserDao;
import com.vijay.myWebApp1.services.LoginService;

@Controller
public class MyController {
    @Autowired
	LoginService service; 
    
	
	@RequestMapping(value = "/home")
	@ResponseBody
    public String sayHello() {
	return "hello Vijay you are ready to go for webapp";
}
	@RequestMapping(value="/login",method = RequestMethod.POST
			)
	@ResponseBody
  public String LoginMethod(@RequestParam String name,@RequestParam String pwd,ModelMap map) 
	{
	map.addAttribute("username",name);
	map.addAttribute("password",pwd);
	
	service.loginValidation(map.getAttribute("username").toString(), map.getAttribute("password").toString());
	
	
		return "login" ;
	}
	
}
