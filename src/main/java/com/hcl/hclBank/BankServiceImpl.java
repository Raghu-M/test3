package com.hcl.hclBank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankServiceImpl implements BankService {

	
	@Autowired
	AccountRepository accrep;

	@Override
	public Account get(int accNo) {
		return accrep.findById(accNo).get();
	}

	
}
