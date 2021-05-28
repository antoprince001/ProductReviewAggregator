package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReviewController {

	@Autowired
	ReviewRepository repo;

	@RequestMapping("/AddReview")
	public String addReview() {
		
		return "AddReview";
	}
	
	@PostMapping("/CreateReview")
	public String createReview(Reviews review) {
		repo.save(review);
		return "ViewReview";
	}
	
	@RequestMapping("/ViewReview")
	public String details() {
		return "ViewReview";
	}
		
//	@PostMapping("/GetReview")
//	public ModelAndView viewdetails(@RequestParam int reviewId) {
//		
//		System.out.println(reviewId);
//		ModelAndView mv = new ModelAndView("ShowReview");
//		Reviews review = repo.findById(reviewId).orElse(null);
//		mv.addObject(review);
//		return mv;
//	}
	
	@PostMapping("/GetReview")
	@ResponseBody
	public Reviews viewdetails(@RequestParam int reviewId) {
		System.out.println("review");
		System.out.println(reviewId);

		//ModelAndView mv = new ModelAndView("ShowProduct");
		Reviews review = repo.findById(reviewId).orElse(null);
		//mv.addObject(products);
		//System.out.println(products);

		return review;
	}
}
