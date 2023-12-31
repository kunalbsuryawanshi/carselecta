package org.program.controller;

import java.util.Map;

import org.program.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/set-user-rating-review")
	public void setUserRatingAndReview(
			@RequestParam("email")String email,
			@RequestParam("rating")String rating,
			@RequestParam("newCarId") String newCarId,
			@RequestParam("reviewTitle") String reviewTitle,
			@RequestParam("reviewDescription") String reviewDescription
			
			)
	{
		ratingService.setUserRatingAndReview(email,Double.parseDouble(rating),Integer.parseInt(newCarId), reviewTitle,reviewDescription);
		
	}
	
	@GetMapping("/get-car-rating")
	public Map<String, Object> getCarRating(@RequestParam String newCarId) {
		
		return ratingService.getCarRating(Integer.parseInt(newCarId));
	}
	
	@GetMapping("/get-car-ratings-and-reviews")
	public Map<String, Object> getCarRatingAndReviews(@RequestParam String newCarId) {
		return ratingService.getCarRatingAndReview(Integer.parseInt(newCarId));
	}
	
}
