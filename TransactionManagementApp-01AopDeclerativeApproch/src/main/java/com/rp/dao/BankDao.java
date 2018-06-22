package com.rp.dao;

public interface BankDao {
	
	public int withdraw(int acNo , int amount);
	public int deposite(int acNo ,int amount);

}
