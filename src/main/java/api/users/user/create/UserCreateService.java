package api.users.user.create;

import api.users.domain.user.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserCreateService {
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
}
