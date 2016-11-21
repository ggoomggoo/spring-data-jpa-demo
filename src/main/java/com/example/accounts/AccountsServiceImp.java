package com.example.accounts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImp implements AccountsService {
	
	@Autowired
	AccountsRepository accountRepository;

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account findOne(Integer accountNo) {
		return accountRepository.findOne(accountNo);
	}

	@Override
	public void delete(Integer accountNo) {
		accountRepository.delete(accountNo);
	}

}
