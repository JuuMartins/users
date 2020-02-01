package api.users.user.update;

import api.users.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserUpdateController {
    private UserUpdateService userService;

    public UserUpdateService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserUpdateService userService) {
        this.userService = userService;
    }

    @PutMapping("/{id}")
    public User userUpdateRest(@RequestBody User user, @PathVariable Long id) {
        return userService.updateUser(user);
    }
}
