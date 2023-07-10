package com.demo.SpringBoot11.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account607")
public class Account {
	@Id
	private int ac;
	private String hname;
	private int balance;
	private int loan;
	public Account() {
		super();
	}
	public Account(int ac, String hname, int balance, int loan) {
		super();
		this.ac = ac;
		this.hname = hname;
		this.balance = balance;
		this.loan = loan;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getLoan() {
		return loan;
	}
	public void setLoan(int loan) {
		this.loan = loan;
	}
	@Override
	public String toString() {
		return "Account [ac=" + ac + ", hname=" + hname + ", balance=" + balance + ", loan=" + loan + "]";
	}

}
