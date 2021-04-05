package com.oschepich.spring.rest.rest.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public ModelAndView showLogin() {
        return new ModelAndView("login");
    }

    // контроллер для вывода ошибки (некорректного ввода данных)
    @GetMapping("/access")
    public String showAccessDenied() {
        return "access";
    }
}