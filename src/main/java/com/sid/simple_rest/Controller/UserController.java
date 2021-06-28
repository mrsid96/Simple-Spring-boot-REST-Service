package com.sid.simple_rest.Controller;

import com.sid.simple_rest.DAO.UserDAO;
import com.sid.simple_rest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userDAO.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        return userDAO.getUser(id);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userDAO.save(user);
    }
}
