package com.example.libraries.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MembersLoginController {
    @GetMapping("")
     public  String Member(){
        return "memberdashS";
    }
}
