package web.Service;


import org.springframework.stereotype.Component;
import web.Model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private static int counter;
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++counter, "Tom", "dsc"));
        users.add(new User(++counter, "Bob", "dwsc"));
        users.add(new User(++counter, "Mike", "dwwdcw"));
        users.add(new User(++counter, "Katy", "edwdcsd"));
    }

    public List<User> index() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(++counter);
        users.add(user);
    }

}
