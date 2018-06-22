package com.rp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements BankDao {
	private static final String WITHDRAW_QUERY = "UPDATE ACCOUNT SET BALANCE = BALANCE-? WHERE ACNO= ?";
	private static final String DEPOSITE_QUERY = "UPDATE ACCOUNT SET BALANCE = BALANCE+? WHERE ACNO= ?";
	JdbcTemplate jt =null;	
	
	public BankDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
		}

	@Override
	public int withdraw(int acNo, int amount) {
		int result =0; 
		result =jt.update(WITHDRAW_QUERY , amount, acNo);
		return result;
	}

	@Override
	public int deposite(int acNo, int amount) {
		int result =0;
		result = jt.update(DEPOSITE_QUERY, amount,acNo );
		return result;
	}
}
