package edu.miu.cs489.banksystem.service.impl;

import edu.miu.cs489.banksystem.model.User;
import edu.miu.cs489.banksystem.repository.UserRepository;
import edu.miu.cs489.banksystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> addNewUser(User user) {
        return Optional.of(userRepository.save(user));
    }

    @Override
    public Optional<User> findUserByUserName(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public Optional<List<User>> getAllUsers() {
        return Optional.of(userRepository.findAll());
    }

    @Override
    public Optional<User> updateUser(String username, User user) {
       Optional<User> foundUser = userRepository.findUserByUsername(username);
        System.out.println(foundUser);
        if (foundUser.isPresent()){
            foundUser.get().setUsername(user.getUsername());
            foundUser.get().setPassword(user.getPassword());
        }
        return Optional.empty();
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();

    }

    @Override
    public void deleteUserByUsername(String username) {
        userRepository.deleteByUsername(username);

    }
}
