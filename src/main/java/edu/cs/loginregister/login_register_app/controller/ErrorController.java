package edu.cs.loginregister.login_register_app.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ErrorController {

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
