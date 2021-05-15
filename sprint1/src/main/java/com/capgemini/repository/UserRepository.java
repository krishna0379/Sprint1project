package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.entities.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	@Query("SELECT u from User u WHERE u.username =:username")
	public User findByUsername(String username);
	
	@Query("SELECT u from User u WHERE u.username=:username")
	public boolean usernameExists(@Param("username") String username);

	public Boolean existsByUsername(String username);
}
