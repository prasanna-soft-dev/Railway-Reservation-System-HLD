package Service;

import Entity.User;

public interface UserService {
    User createUser(String userName, String email, String address, String password);
}
