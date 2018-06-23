package com.rp.service;

import com.rp.dao.BankDao;

public interface BankService {
	public String moneyTransferSystem(int sourceAcNo , int destAcNo , int amount) throws RuntimeException;
	

}
