package com.vijay.myWebApp1.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vijay.myWebApp1.Entity.User;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public User FindById(String userId) {
		return entityManager.find(User.class,userId);
	}
	
	
}
