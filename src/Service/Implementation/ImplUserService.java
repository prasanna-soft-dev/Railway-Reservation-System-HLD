package Service.Implementation;

import Entity.User;
import Repository.UserRepository;
import Service.UserService;

public class ImplUserService implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(String userName, String email, String address, String password) {
        if(userRepository.findByEmail(email) != null){
            throw new RuntimeException("User Already Exists with given email");
        }

        User user = new User(userName, email, address, password);

        return userRepository.save(user);
    }
}
