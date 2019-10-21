package me.DJ1TJOO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.DJ1TJOO.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username); //auto search on username
	
}
