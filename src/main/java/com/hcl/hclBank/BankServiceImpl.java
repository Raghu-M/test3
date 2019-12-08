package com.hcl.hclBank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankServiceImpl implements BankService {


	@Autowired
	AccountRepository accrep;

	@Override
	public String create(Account acc) {
		accrep.save(acc);
		return "Account Saved";
	}

	@Override
	public String credit(Account acc) {
		acc.setAmount(accrep.findById(acc.getAccountno()).get().getAmount()+acc.getAmount()); 
		accrep.save(acc);
		return "Your Amount Has been credited  \n your current balance is RS."+acc.getAmount();
	}

	@Override
	public String debit(Account acc) {
		if(acc.getAmount() < accrep.findById(acc.getAccountno()).get().getAmount()) {
			acc.setAmount(accrep.findById(acc.getAccountno()).get().getAmount()-acc.getAmount()); 
			accrep.save(acc);
			return "Your Amount Has been debited  \n your current balance is RS."+acc.getAmount();
		}
		else
		return "you Dont have Sufficient Balance";
	}

	@Override
	public List<Account> getAll(int userid) {
		
		return (List<Account>) accrep.findAllByuserid(userid);

	}

	
}
