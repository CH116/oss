package com.ch.oss.controller;

import com.ch.oss.entity.User;
import com.ch.oss.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import java.util.List;


@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/user/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute User user, Model model) {
        int status;
        List<User> record = userService.selectSelective(user);
        if (record.isEmpty()) {
            status = userService.insert(user);
        } else {
            User user1 = record.get(0);
            System.out.println("name="+user1.getUsername());
            System.out.println("id="+user1.getId());
            status = 2;
        }
        model.addAttribute("status", status);
        return "register";
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute User user, Model model) {
        List<User> record = userService.selectSelective(user);
        if (!record.isEmpty()) {
            User u = record.get(0);
            if (u.getPassword().equals(user.getPassword())) {
                model.addAttribute("status", 0);
            } else {
                model.addAttribute("status", 2);
            }
        } else {
            model.addAttribute("status", 1);
        }
        return "login";
    }
}
