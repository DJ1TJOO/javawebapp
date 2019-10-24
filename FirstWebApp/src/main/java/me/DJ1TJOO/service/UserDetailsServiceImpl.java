package me.DJ1TJOO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import me.DJ1TJOO.domain.User;
import me.DJ1TJOO.repository.UserRepository;
import me.DJ1TJOO.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo; //'sql table'
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("Incorrect username or password");
		 
		return new CustomSecurityUser(user);
	}

}