package com.example.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mpd implements Serializable {
	

	@Id @GeneratedValue @Column(name="mpd_id")
	private Long id;
	
	@OneToMany(mappedBy = "mpd", targetEntity = MpdTask.class)
	private Set<MpdTask> mpdTask;

	
	public Mpd() {
		super();
	}

	public Mpd(Long id, Set<MpdTask> mpdTask) {
		super();
		this.id = id;
		this.mpdTask = mpdTask;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<MpdTask> getMpdTask() {
		return mpdTask;
	}

	public void setMpdTask(Set<MpdTask> mpdTask) {
		this.mpdTask = mpdTask;
	}

}
