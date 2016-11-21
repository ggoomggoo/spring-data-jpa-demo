package com.example.accounts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private Integer accountNo;
	
	private String userNo;
	
	public Account() {
	}
	
	public Account(Integer accountNo, String userNo) {
		super();
		this.accountNo = accountNo;
		this.userNo = userNo;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

}
