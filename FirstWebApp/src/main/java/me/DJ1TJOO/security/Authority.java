package me.DJ1TJOO.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import me.DJ1TJOO.domain.User;

@Entity
public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = -3195305517131594147L;
	private Long id;
	private String authority;
	private User user;
	
	@Override
	public String getAuthority() {
		return this.authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
