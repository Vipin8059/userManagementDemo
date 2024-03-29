package com.geekster.userManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("user/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return  userService.getUserById(userId);
    }

}
