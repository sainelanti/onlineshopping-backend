package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.User;

public interface UserDao extends JpaRepository<User, String>{

//	User findBy(Class<User> class1, String email, String password);

}
