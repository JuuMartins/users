package com.api.users.create;

import com.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserCreateController {
    private UserCreateService userService;

    public UserCreateService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserCreateService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User userCreateRest(@RequestBody User user) {

        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User userListRest(@PathVariable Long id) {

        return userService.findById(id);
    }
}
