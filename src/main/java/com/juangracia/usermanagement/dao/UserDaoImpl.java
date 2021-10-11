package com.juangracia.usermanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.juangracia.usermanagement.models.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		String query = "FROM User";
		return entityManager.createQuery(query, User.class).getResultList();
	}

	@Override
	public void deleteUser(Long id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
	}

	@Override
	public void createUser(User user) {
		System.out.println(user);
		entityManager.merge(user);
	}

}
