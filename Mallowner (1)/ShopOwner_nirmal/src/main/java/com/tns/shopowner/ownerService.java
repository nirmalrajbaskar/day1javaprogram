package com.tns.shopowner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ownerService
{
	@Autowired
	private ownerRepository repo;
	
	//Get all the records from the table
	public void insertRecord(Mallowner owner)
	{
		repo.save(owner);
	}
	
	//Show all the records from the table in database
	public List<Mallowner> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Mallowner getownerById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteowner(Integer id)
	
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateowner(Integer id,Mallowner updateowner)
	{
		Mallowner existingowner=repo.findById(id).orElse(null);
		if(existingowner!=null)
		{
			existingowner.setOwnerid(updateowner.getOwnerid());
			existingowner.setUsername(updateowner.getUsername());
			existingowner.setPassword(updateowner.getPassword());
			existingowner.setEmail(updateowner.getEmail());
			existingowner.setPhone(updateowner.getPhone());
			existingowner.setAddress(updateowner.getAddress());
			repo.save(existingowner);
		}
	}
	
	

}
