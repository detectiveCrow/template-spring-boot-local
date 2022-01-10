package com.example.user.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping(value = "api/test")
	public String test() {
		String json = "{name : 'hello world}";
		return json;
	}
	
    @GetMapping(value = "/api/user")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @GetMapping(value = "/api/user/{userId}")
    public String getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }
}
