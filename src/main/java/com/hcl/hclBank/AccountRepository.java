package com.hcl.hclBank;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account, Integer>{
	public List<Account> findAllByuserid(int id); 


public List<Account> findAllByuserid(int id); 



}
