package edu.miu.cs489.banksystem.repository;

import edu.miu.cs489.banksystem.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {
     Optional<User> findUserByUsername(String username);
     void deleteByUsername(String username);
}