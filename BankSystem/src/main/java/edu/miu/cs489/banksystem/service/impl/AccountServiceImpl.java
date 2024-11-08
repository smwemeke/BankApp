package edu.miu.cs489.banksystem.service.impl;

import edu.miu.cs489.banksystem.model.Account;
import edu.miu.cs489.banksystem.service.AccountService;

import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements AccountService {

    @Override
    public Optional<Account> addNewAccount(Account account) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> updateAccount(Integer accountNumber, Account account) {
        return Optional.empty();
    }

    @Override
    public void deleteAccount(Integer accountNumber) {

    }

    @Override
    public void deleteAllAccounts() {

    }

    @Override
    public Optional<Account> getAccount(Integer accountNumber) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Account>> getAllAccounts() {
        return Optional.empty();
    }
}
