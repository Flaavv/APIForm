package com.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	


	@Id @GeneratedValue @Column(name = "user_id")
	private Long id;
	private String firstName;
	private String lastName;
	private String role;
	@OneToMany(mappedBy = "user", targetEntity = MpdTask.class)
	private Set<MpdTask> mpdTask;

	
	
	public User() {
		super();
	}
	
	public User(Long id, String firstName, String lastName, String role, Set<MpdTask> mpdTask) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.mpdTask = mpdTask;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Set<MpdTask> getMpdTask() {
		return mpdTask;
	}

	public void setMpdTask(Set<MpdTask> mpdTask) {
		this.mpdTask = mpdTask;
	}
	
	
}
