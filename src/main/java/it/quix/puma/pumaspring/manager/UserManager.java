package it.quix.puma.pumaspring.manager;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import it.quix.puma.pumaspring.dao.UserRepository;
import it.quix.puma.pumaspring.domain.User;

public class UserManager {

    @Autowired
    private UserRepository userRepository;


    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    public List<User> searchUser() {
        return userRepository.findAll();
    }

    public User findById(String userId) {
        return userRepository.getOne(userId);
    }



}
