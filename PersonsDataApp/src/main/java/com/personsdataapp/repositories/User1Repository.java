package com.personsdataapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personsdataapp.entities.User1;

@Repository
public interface User1Repository extends JpaRepository<User1, Integer>{

}
