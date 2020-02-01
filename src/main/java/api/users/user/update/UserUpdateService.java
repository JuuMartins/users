package api.users.user.update;

import api.users.domain.user.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserUpdateService {
    public User updateUser(@RequestBody User user) {
        User newUser = new User("trillian", "Tricia", "McMillan",
                "1994-01-01", "tricia42@earth.com", "1");

        return newUser;
    }
}
