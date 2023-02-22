package com.personsdataapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personsdataapp.entities.User1;
import com.personsdataapp.repositories.User1Repository;

@Service
public class User1Service {

	@Autowired
	User1Repository user1Repository;

	public User1 addUser(User1 u) {
		return user1Repository.save(u);
	}

	public List<User1> getUser() {
		return user1Repository.findAll();
	}

	public User1 updatePerson(User1 u) {
		User1 u1=user1Repository.findById(u.getUserId()).get();
		if(u1!=null) {
			u1.setUserId(u.getUserId());
			u1.setUserMailId(u.getUserMailId());
			u1.setUserMobile(u.getUserMobile());
			u1.setUserName(u.getUserName());
			return u1;
		}
		return u;
	}

	public User1 deletePerson(int id) {
		User1 u=user1Repository.findById(id).get();
		if(u!=null) {
			user1Repository.delete(u);
			return u;
		}
		return u;
	}
}
