package com.example.library.user;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/sign-up")
    public String register(@RequestParam("username") String name,
                           @RequestParam("password") String password,
                           @RequestParam("email") String email
    )
    {
        userService.register(name, password);
        return "redirect:/";
    }





}
