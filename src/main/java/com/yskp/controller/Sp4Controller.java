package com.yskp.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yskp.entities.User;

 
/**
 *  
 * @author xgf
 *
 */
@Controller
@RequestMapping("/sp4")
public class Sp4Controller {
	@RequestMapping(value="m1",method=RequestMethod.GET)
	@ResponseBody
	public String m1(){
		return "inm1";
	}
	
	@RequestMapping(value = "/m2",method=RequestMethod.POST)
	public ResponseEntity<User> m2(HttpEntity<User> requestEntity) throws UnsupportedEncodingException {
		User user = requestEntity.getBody();
		//System.out.println("######:"+user+"---"+user.getRealName());
		user.setUserId("1000");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value="/m3",method=RequestMethod.GET)
	public String m3(ModelMap mm){
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setUserId("1");
		user.setUserName("zhangsan");
		list.add(user);
		User user1 = new User();
		user1.setUserId("2");
		user1.setUserName("lisi");
		list.add(user1);
		mm.addAttribute("list", list);
		return "suc";
	}
	
	@RequestMapping(value="/m4" ,method=RequestMethod.GET)
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
		return "userFtl";
	}
	
}
