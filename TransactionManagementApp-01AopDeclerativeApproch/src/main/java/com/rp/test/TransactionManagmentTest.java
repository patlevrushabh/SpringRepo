package com.rp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rp.service.BankService;

public class TransactionManagmentTest {

	public static void main(String[] args) {
		ApplicationContext ctx =null;
		String result =null;
		BankService proxy =null;
		ctx= new ClassPathXmlApplicationContext("com/rp/cfgs/applicationContext.xml");
		proxy =ctx.getBean("pfb", BankService.class);
		try {
		result = proxy.moneyTransferSystem(101, 103, 5000);
		System.out.println(result);
		}catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
		((AbstractApplicationContext) ctx).close();

	}

}
