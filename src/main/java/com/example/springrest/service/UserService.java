package com.example.springrest.service;

import com.example.springrest.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> usersList;

    public UserService() {
        usersList = new ArrayList<>();

        User user1 = new User(1, "Joe", 32, "joedoe@email.com");
        User user2 = new User(2, "Jane", 20, "janedoe@email.com");

        usersList.addAll(Arrays.asList(user1, user2));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();

        for (User user : usersList) {
            if (id.equals(user.getId())) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
