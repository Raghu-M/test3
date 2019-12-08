/**
 * 
 */
package com.hcl.hclBank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/")
public class BankController {

	@Autowired
	BankService bank;
	

	
	@PostMapping(value="/create")
	public String create(@RequestBody Account acc) {
		return bank.create(acc);
		
	}
	
	@PostMapping(value="/credit")
	public String credit(@RequestBody Account acc) {
		return bank.credit(acc);
		
	}
	
	@PostMapping(value="/debit")
	public String debit(@RequestBody Account acc) {
		return bank.debit(acc);
	}
		
	@GetMapping(value="/getAll/{id}")
	public Account[] getAll(@PathVariable("id") int id) {
		System.out.println("\n\n\n"+"Controller"+"\n\n\n\n");
		return  bank.getAll(id).toArray(new Account[bank.getAll(id).size()]);
	}

	
	
	
	
}
