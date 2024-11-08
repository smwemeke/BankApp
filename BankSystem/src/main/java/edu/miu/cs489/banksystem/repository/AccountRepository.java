package edu.miu.cs489.banksystem.repository;

import edu.miu.cs489.banksystem.model.Account;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AccountRepository extends MongoRepository<Account, ObjectId> {
    Optional<Account> findByAccountNumber(Integer acountNumber);
}
