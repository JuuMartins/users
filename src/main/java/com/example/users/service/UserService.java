package com.example.users.service;

import com.example.users.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public Iterable<User> findAll() {
        List<User> users = new ArrayList<>();
        User user = new User("trillian", "Tricia", "McMillan",
                "1994-01-01", "tricia42@dolphins.com", "1");
        User user2 = new User("trillian2", "Tricia2", "McMillan2",
                "1994-01-01", "tricia42_2@dolphins.com", "2");
        users.add(user);
        users.add(user2);

        return users;
    }

    public User findById(@PathVariable Long id) {
        User user = new User("trillian", "Tricia", "McMillan",
                "1994-01-01", "tricia42@dolphins.com", "1");

        return user;
    }

    public User createUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setId("1");

        return newUser;
    }

    public User updateUser(@RequestBody User user) {
        User newUser = new User("trillian", "Tricia", "McMillan",
                "1994-01-01", "tricia42@earth.com", "1");

        return newUser;
    }
}