package com.tddchalenge.tddchalenge.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.tddchalenge.tddchalenge.entities.Event;

public class EventDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private LocalDate date;
	private String url;
	
	public EventDTO() {}
	
	public EventDTO(Event e) {
		this.name = e.getName();
		this.date = e.getDate();
		this.url = e.getUrl();
		
	}

	public EventDTO(String name, LocalDate date, String url) {
		this.name = name;
		this.date = date;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	

}