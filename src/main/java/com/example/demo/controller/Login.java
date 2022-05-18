package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.IUser;
import com.example.demo.service.UserService;

@Controller
@ComponentScan({"service"})
public class Login {
	@Resource
	private UserService userService;
	
	@RequestMapping(value ="/login",method=RequestMethod.GET)
    public String login(Model model) {
        return ("/login");

}
	@RequestMapping(value ="/auth",method=RequestMethod.POST)
    public String login(@RequestParam(value="accountId") String accountId ,@RequestParam(value="password") String password ,Model model) {
        String url = null;
        String message = null;
        IUser user = userService.queryUser(accountId);
        if (user == null) {
            message = "不正なユーザIDです!";
            model.addAttribute("message", message);
            url = "/login";
        } else if (!password.equals(user.getPassword())) {
            message = "不正なパスワードです!";
            model.addAttribute("message", message);
            url = "/login";
        } else {
            url = "/success";
        }
        return url;
    }
}