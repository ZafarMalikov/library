package com.example.library.springConfig;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {



    @GetMapping("/sign-in")
    public String signIn() {
        return "reg/sign-in";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "reg/sign-up";
    }


}
