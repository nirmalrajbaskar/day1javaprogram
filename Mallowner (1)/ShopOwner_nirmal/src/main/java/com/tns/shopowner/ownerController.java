package com.tns.shopowner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ownerController 
{
	@Autowired
	private ownerService service ;

	@PostMapping("/mallowner")
	public void add(@RequestBody Mallowner Owner)
	{
		service.insertRecord(Owner);
	}
	
	@GetMapping("/mallowner")
	public List<Mallowner> ShowAll()
	{
		return service.getAllRecords();
	}
	
	@GetMapping("/mallowner/{id}")
	public Mallowner getUserById(@PathVariable Integer id)
	{
		return service.getownerById(id);
	}
	
	@DeleteMapping("/shopowner/{id}")
	public void deleteowner(@PathVariable Integer id)
	{
		service.deleteowner(id);
	}
	
	@PutMapping("/mallshopowner/{id}")
	public ResponseEntity<String> updateowner(@PathVariable Integer id,@RequestBody Mallowner updatedowner)
	{
		service.updateowner(id,updatedowner);
		return ResponseEntity.ok("owner updated Successfully");
	}

}

