package com.demo.SpringBoot11.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringBoot11.beans.Account;

public interface AccountDao extends JpaRepository<Account, Integer>{

}
