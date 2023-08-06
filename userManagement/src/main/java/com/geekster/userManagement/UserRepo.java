package com.geekster.userManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Repository
public class UserRepo {
    ArrayList<User> userArrayList = new ArrayList<>();

    public String addUser(User user) {
        String contact = user.getUserContact();
        int length = contact.length();
        if(length!=10){
            return "user contact is not valid";
        }
        else{
            userArrayList.add(user);
            return "User added successfully";
        }
    }

    public User getUserById(Integer userId) {
      return  userArrayList.get(userId);

    }
}
