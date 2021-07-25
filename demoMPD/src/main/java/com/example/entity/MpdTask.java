package com.example.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.mapping.Array;

@Entity
public class MpdTask implements Serializable {
	


	@Id @GeneratedValue
	Long id;
	String title;
	String description;
	String taskRef;
	@Temporal(TemporalType.DATE)
	Date date;
	@ManyToOne
	@JoinColumn(name="mpd_id")
	Mpd mpd;
	@ManyToOne
	@JoinColumn(name = "user_id")
	User user;
	
	
	public MpdTask() {
		super();
	}
	
	public MpdTask(Long id, String title, String description, String taskRef, Mpd mpd, User user, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.taskRef = taskRef;
		this.mpd = mpd;
		this.user = user;
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTaskRef() {
		return taskRef;
	}
	public void setTaskRef(String taskRef) {
		this.taskRef = taskRef;
	}

	public Mpd getMpd() {
		return mpd;
	}

	public void setMpd(Mpd mpd) {
		this.mpd = mpd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
