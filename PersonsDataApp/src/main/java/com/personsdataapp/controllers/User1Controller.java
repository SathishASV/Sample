package com.personsdataapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personsdataapp.entities.User1;
import com.personsdataapp.services.User1Service;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class User1Controller {
	
	@Autowired
	User1Service user1Service;
	
	@PostMapping(value="PDA/addpersons")
	User1 addUser(@RequestBody User1 u) {
		return user1Service.addUser(u);
	}
	
	@GetMapping(value="PDA/getpersons")
	public List<User1> getUser(User1 u) {
		return user1Service.getUser();
	}
	
	@PutMapping(value="PDA/updatePerson")
	public User1 updatePerson(User1 u) {
		return user1Service.updatePerson(u);
	}
	
	@DeleteMapping(value="PDA/deletePerson/{id}")
	public User1 deletePerson(@PathVariable int id) {
		return user1Service.deletePerson(id);
	}
}
