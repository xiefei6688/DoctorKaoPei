package com.yskp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yskp.bean.User;
import com.yskp.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    private UserServiceImpl userServiceImpl;
    @RequestMapping(value = "/index")//物资供应科
	//@RequiresPermissions("ssbgl_manage:sp")
	public ModelAndView ckrkshow(ModelMap modelMap, HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		//modelAndView.addObject("basePathUrl",CodeField.getBasePathUrl(request));
		modelAndView.setViewName("/index");
		return modelAndView; 
	}
    
    @RequestMapping (value="/listjson", method = RequestMethod.GET,produces="application/json")
	@ResponseBody
	public User listjson(ModelMap modelMap,HttpServletRequest request,int id){
    	User user = userServiceImpl.getUserById(1);
    	return user;
	}
    
    @RequestMapping(value = "/test")
    public String Index(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userServiceImpl.getUserById(userId);
        model.addAttribute("user",user);
         return "User";
    }

}
