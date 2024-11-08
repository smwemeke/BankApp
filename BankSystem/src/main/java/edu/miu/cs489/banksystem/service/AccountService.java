package edu.miu.cs489.banksystem.service;

import edu.miu.cs489.banksystem.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {
    public Optional<Account> addNewAccount(Account account);
    public Optional<Account> updateAccount (Integer accountNumber, Account account);
    public void deleteAccount(Integer accountNumber);
    public void deleteAllAccounts();
    public Optional<Account> getAccount(Integer accountNumber);
    public Optional <List<Account>> getAllAccounts();

}
