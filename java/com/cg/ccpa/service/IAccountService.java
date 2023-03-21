package com.cg.ccpa.service;

import java.util.List;

import com.cg.ccpa.entity.Account;

public interface IAccountService {
	
    Account addAccount(Account account);
	
	public Account removeAccount(long id);
	
	Account updateAccount(long id,Account account);
	
    Account getAccount(long id);
	
	List<Account> getAllAccounts();
}
