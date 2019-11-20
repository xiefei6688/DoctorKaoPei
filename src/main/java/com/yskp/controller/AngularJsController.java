package com.yskp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yskp.entities.User;

/**
 *  整合angularJs
 * @author xgf
 *https://www.angularjs.net.cn/
 *https://angular.cn/start
 *https://www.runoob.com/angularjs/angularjs-tutorial.html
 */
@Controller
@RequestMapping("/angularJs") 
public class AngularJsController {
	@RequestMapping(value="/show" ,method=RequestMethod.GET)
	public String m4(ModelMap mm){
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setUserId("1");
		user.setUserName("zhangsan");
		list.add(user);
		User user1 = new User();
		user1.setUserId("2");
		user1.setUserName("lisi");
		list.add(user1);
		mm.addAttribute("userList", list);
		return "angularJsShow";
	}
}
