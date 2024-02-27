package com.jlcindia.userratings;

import java.util.List;

public interface RatingService {

	public void addUserRating(UserRating userRating); //save
	public List<UserRating> getUserRatingByBookId(Integer bookId); //101
	public List<UserRating> getUserRatingByUserId(String userId); //U-123
	public BookRating getBookRatingByBookId(Integer bookId); //101
	
}
