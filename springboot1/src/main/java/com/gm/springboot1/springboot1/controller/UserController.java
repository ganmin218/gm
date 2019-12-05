package com.gm.springboot1.springboot1.controller;

import com.gm.springboot1.springboot1.entity.Euser;
import com.gm.springboot1.springboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Euser> getAll(){
        List<Euser> eusers = userService.selectAll();
        return eusers;
    }

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model){
        List<Euser> eusers = userService.selectAll();
        model.addAttribute("userList",eusers);
        model.addAttribute("username","张三");
        return "showUser";
    }

}
