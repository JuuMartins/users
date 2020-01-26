package com.example.users.controller;

import com.example.users.entity.User;

import com.example.users.service.UserService;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> userGetRest() {

        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User userListRest(@PathVariable Long id) {

        return userService.findById(id);
    }

    @PostMapping
    public User userCreateRest(@RequestBody User user) {

        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User userUpdateRest(@RequestBody User user, @PathVariable Long id) {

        return userService.updateUser(user);
    }

}
