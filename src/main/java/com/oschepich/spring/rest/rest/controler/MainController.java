package com.oschepich.spring.rest.rest.controler;

import com.oschepich.spring.rest.rest.model.User;
import com.oschepich.spring.rest.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class MainController {

    private final UserService userService;
    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/main")
    public String getMainAdmin() {
          return "admin";
    }

//    @GetMapping("/user")
//    public String getMainUser() {
//        return "user";
//    }

    }
