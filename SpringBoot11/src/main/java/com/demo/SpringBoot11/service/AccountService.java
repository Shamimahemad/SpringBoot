package com.demo.SpringBoot11.service;

import java.util.List;

import com.demo.SpringBoot11.beans.Account;

public interface AccountService {

	List<Account> getAll();

	void addAccount(Account a);

}
