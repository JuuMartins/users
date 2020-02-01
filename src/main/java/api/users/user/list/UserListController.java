package api.users.user.list;

import api.users.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserListController {
    private UserListService userService;

    public UserListService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserListService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> userGetRest() {
        return userService.findAll();
    }
}
