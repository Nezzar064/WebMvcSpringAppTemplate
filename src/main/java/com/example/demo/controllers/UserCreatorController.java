package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserCreatorController {

    @GetMapping(value="/user")
    public String createProductPage() {
        return "formExample";
    }

    @PostMapping(value="/create-user")
    public String createUser(@RequestParam("name") String name, @RequestParam("phone") int phone) {
        //Simulating the creation of a new user
        System.out.println(name);
        System.out.println(phone);

        return "redirect:/user-success";
    }

    @GetMapping(value="/user-success")
    @ResponseBody
    public String showUserSuccess(@RequestParam String name, @RequestParam int phone) {
        return "USER IS CREATED MADAFAKAAA with: Name: " + name + " phone: " + phone;
    }

}
