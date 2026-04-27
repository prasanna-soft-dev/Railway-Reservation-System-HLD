package Repository;

import Entity.User;



public interface UserRepository {
    User save(User user);
    User findByEmail(String email);
}
