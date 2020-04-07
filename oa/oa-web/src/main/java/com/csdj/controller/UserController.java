package com.csdj.controller;

import com.csdj.pojo.Users;
import com.csdj.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    userService service;
    @GetMapping("/getAll")
    public List<Users> getAll(){
        return service.getAll();
    }
}
