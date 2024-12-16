package com.example.tmdb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tmdb.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
	
	 Rating findByName(String name);
	 
	 List<Rating> findAllByAvgRatingBetween(double min,double max);

}
