package com.cg.ccpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ccpa.entity.Account;
import com.cg.ccpa.repository.IAccountRepository;

@Service("IAccountService")
public class IAccountServiceImpl implements IAccountService{
	
	@Autowired
	IAccountRepository iAccountRepository;

	@Override
	public Account addAccount(Account account) {
		iAccountRepository.save(account);
		return account;
	}

	@Override
	public Account removeAccount(long id){
		iAccountRepository.deleteById(id);
		return null;
	
	}

	@Override
	public Account updateAccount(long id, Account account) {
		return account;
		
	}

	@Override
	public Account getAccount(long id)  {
		iAccountRepository.findById(id);
		return null;
	}

	@Override
	public List<Account> getAllAccounts(){
		return iAccountRepository.findAll();
	}
	
}
	