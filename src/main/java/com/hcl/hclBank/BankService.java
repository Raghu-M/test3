package com.hcl.hclBank;

import java.util.List;

public interface BankService {


	public List<Account> getAll(int userid);
	public String create(Account acc);
	public String credit(Account acc);
	public String debit(Account acc);
  public Account get(int accNo);	
	
}
