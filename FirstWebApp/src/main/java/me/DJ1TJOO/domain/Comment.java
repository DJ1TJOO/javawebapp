package me.DJ1TJOO.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {

	private CommendId pk;
	private String text;
	
	@EmbeddedId
	public CommendId getPk() {
		return pk;
	}
	
	public void setPk(CommendId pk) {
		this.pk = pk;
	}
	
	@Column(length = 5000) //max text length
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
}
