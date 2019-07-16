package com.stackroute.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/hello")
    //read the provided form data
    public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m)
    {
        User user = new User();
        user.setUserName(name);
        user.setUserPassword(pass);
        if(user.getUserPassword().equals("password"))
        {
            String msg= user.getUserName();
            //add a message to the model
            m.addAttribute("message", msg);
            return "viewpage";
        }
        else
        {
            String msg="Sorry "+ user.getUserName() +". You entered an incorrect password";
            m.addAttribute("message", msg);
            return "errorpage";
        }
    }
}
