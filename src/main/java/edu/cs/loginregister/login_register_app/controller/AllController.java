package edu.cs.loginregister.login_register_app.controller;

import edu.cs.loginregister.login_register_app.entity.Human;
import edu.cs.loginregister.login_register_app.entity.User;
import edu.cs.loginregister.login_register_app.service.HumanService;
import edu.cs.loginregister.login_register_app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class AllController {

    private final UserService userService;
    private final HumanService humanService;

    @GetMapping("/template")
    public String templateHtml() {
        return "template";
    }

    @GetMapping("/register")
    public String registerHtml(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("human", new Human());
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute("user") User user, @ModelAttribute("human") Human human) {

        user.setHuman(human);
        userService.createUser(user);
        humanService.createHuman(human);

        return "success";
    }

    @GetMapping("/login")
    public String loginHtml() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {

        User user = userService.findByEmailAndPassword(email, password);

        if(user!=null && user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("admin")) {
            return "admin";
        }
        else if (user != null && user.getEmail().equals(email) && user.getPassword().equals(password)) {
            return "success";
        }
        return "error";
    }

}
