package edu.miu.cs489.banksystem.service;

import edu.miu.cs489.banksystem.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface UserService {
    public Optional<User> addNewUser(User user);
    public Optional<User> findUserByUserName(String username);
    public Optional <List<User>> getAllUsers();
    public Optional<User> updateUser(String username, User user);
    public void deleteAllUsers();
    public void deleteUserByUsername(String username);

}
