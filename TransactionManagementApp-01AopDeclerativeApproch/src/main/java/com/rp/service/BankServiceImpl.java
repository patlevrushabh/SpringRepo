package com.rp.service;

import com.rp.dao.BankDao;

public class BankServiceImpl implements BankService {
	private BankDao dao =null;	
	
	public BankServiceImpl(BankDao dao) {
		this.dao = dao;
	}

	@Override
	public String moneyTransferSystem(int sourceAcNo, int destAcNo, int amount) throws RuntimeException {
			int result1=0, result2= 0;
		result1 = dao.withdraw(sourceAcNo, amount);
		result2 = dao.deposite(destAcNo, amount);
		
		if(result1<=0 || result2<=0) {
			throw new RuntimeException("Transaction Failed");
		}
		else {
		return "Transaction Sucessfull";
		}
	}

}
