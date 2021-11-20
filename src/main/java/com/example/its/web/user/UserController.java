package com.example.its.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("userList", Collections.emptyList());
        return "users/list";
    }

}
