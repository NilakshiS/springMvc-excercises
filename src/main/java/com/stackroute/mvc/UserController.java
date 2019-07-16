package com.stackroute.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String page(Model model){
        User user = new User();
        user.setName("Nilakshi");
        model.addAttribute("user",user);
        return "home";
    }
}
