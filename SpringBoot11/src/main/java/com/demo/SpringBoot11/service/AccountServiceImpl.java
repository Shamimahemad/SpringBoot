package com.demo.SpringBoot11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBoot11.beans.Account;
import com.demo.SpringBoot11.dao.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public List<Account> getAll() {
		List<Account> alist=accountDao.findAll();
		return alist;
	}

	@Override
	public void addAccount(Account a) {
		accountDao.save(a);
		
	}
	
}
