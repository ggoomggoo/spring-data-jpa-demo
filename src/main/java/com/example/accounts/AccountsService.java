package com.example.accounts;

import java.util.List;

public interface AccountsService {
	List<Account> findAll();
	Account save(Account account);
	Account findOne(Integer accountNo);
	void delete(Integer accountNo);
}
