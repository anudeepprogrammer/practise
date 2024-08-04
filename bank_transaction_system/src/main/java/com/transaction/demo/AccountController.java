package com.transaction.demo;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	Logger logger = LoggerFactory.getLogger(AccountController.class);

	@GetMapping("/account")
	public String getAccountDetails()
	{
		
		logger.info("AccountController Hello");
		return "hello";
	}
	
	@GetMapping("/transaction/details")
	public AccountDto getTransDetails()
	{
		
		logger.info("AccountController -- /transaction/details ");
		AccountDto accountDto = new AccountDto();
		accountDto.setAccNo("12345");
		accountDto.setAccType("Savings");
		accountDto.setTransactionId(getRandomId());
		accountDto.setTransactionName("Debit");
		
		logger.info("-- transaction accountDto--");
		return accountDto;
	}
	
	private String getRandomId()
	{
		return UUID.randomUUID().toString();
	}
	
}
