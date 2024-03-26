package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
		
	@Query(value = "SELECT * FROM USER WHERE account=? AND password=?", nativeQuery = true)
	public User findByAccountAndPassword(String account, String password);
	
}