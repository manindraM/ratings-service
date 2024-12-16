package com.example.tmdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private double avgRating;
	
	private int count;
	
	
	
	
	

}
