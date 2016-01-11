package io.github.oleiva.dao.user;

import io.github.oleiva.dao.Dao;
import io.github.oleiva.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserDao extends Dao<User, Long>, UserDetailsService {

	User findByName(String name);
}