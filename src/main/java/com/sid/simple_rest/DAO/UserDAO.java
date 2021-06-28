package com.sid.simple_rest.DAO;

import com.sid.simple_rest.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDAO {
    private static List<User> users = new ArrayList<>();
    private static int userCounter =3;
    static {
        users.add(new User(1, "Sidharth", new Date()));
        users.add(new User(2, "Patnaik", new Date()));
        users.add(new User(3, "Adam", new Date()));
    }

    public List<User> getUsers() {
        return users;
    }

    public User save(User user){
        if(user.getId() == null) {
            user.setId(++userCounter);
        }
        users.add(user);
        return user;
    }

    public User getUser(int id){
        for(User user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
