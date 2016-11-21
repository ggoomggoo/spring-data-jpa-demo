package com.example.accounts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("accounts")
public class AccountsController {
	
	@Autowired
	AccountsService accountService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Account> findAll() {
		return accountService.findAll();
	}
	
	@RequestMapping(value="/${accountNo}", method=RequestMethod.GET)
	public void findOne() {
		/* ... */
	}
	
	@RequestMapping(value="/${accountNo}", method=RequestMethod.POST)
	public void save() {
		/* ... */
	}
	
	@RequestMapping(value="/${accountNo}", method=RequestMethod.DELETE)
	public void delete() {
		/* ... */
	}
	
}
