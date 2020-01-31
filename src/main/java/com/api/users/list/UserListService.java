package com.api.users.list;

import com.api.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserListService {
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
}
