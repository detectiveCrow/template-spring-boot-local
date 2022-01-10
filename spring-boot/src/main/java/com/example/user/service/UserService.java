package com.example.user.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

	private UserRepository userRepository;
	
	public List<User> getUserList() {
		return userRepository.findAll();
	}
	
	public String getUser(Long userId) {
        return "{\n" +
                "\t\t\"id\": 1,\n" +
                "\t\t\"name\": \"¿Ã»£º∫\",\n" +
                "\t\t\"age\": 29,\n" +
                "\t}";
	}
}
