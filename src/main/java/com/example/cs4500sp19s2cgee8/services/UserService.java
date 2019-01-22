package com.example.cs4500sp19s2cgee8.services;

import com.example.cs4500sp19s2cgee8.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserService {
    static List<User> users = new ArrayList();

    static {
        users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
        users.add(new User(234, "bob", "bob", "Bob", "Marley"));
    }

    @GetMapping("/api/user")
    public List<User> findAllUsers() {
        return users;
    }
}