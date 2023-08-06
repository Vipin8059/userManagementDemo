package com.geekster.userManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String addUser(User user) {

        return userRepo.addUser(user);
    }

    public User getUserById(Integer userId) {
        return userRepo.getUserById(userId);
    }



}
