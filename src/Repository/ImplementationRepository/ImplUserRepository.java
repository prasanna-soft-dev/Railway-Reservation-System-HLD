package Repository.ImplementationRepository;

import Entity.User;
import Repository.UserRepository;
import Service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class ImplUserRepository implements UserRepository {

    private static Map<Long, User> users = new HashMap<>();
    private static Map<String, User> indexing = new HashMap<>();
    private static AtomicLong id = new AtomicLong(0);

    @Override
    public User save(User user) {

        if(indexing.containsKey(user.getEmail())){
            throw new RuntimeException("User Already Exists with the given email");
        }
        long newId = id.incrementAndGet();
        user.setId(newId);
        users.put(newId, user);
        indexing.put(user.getEmail(), user);
        return user;
    }

    @Override
    public User findByEmail(String email) {
        return indexing.get(email);
    }
}
