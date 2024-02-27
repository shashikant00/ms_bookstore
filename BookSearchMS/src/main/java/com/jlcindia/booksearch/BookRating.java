package com.jlcindia.booksearch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mybookratings",schema = "jlcbooksdb")
public class BookRating {

	@Id
	@Column(name = "book_id")
	private Integer bookId;
	
	@Column(name = "avg_Rating")
	private double avgRating;
	
	@Column(name = "number_of_searches")
	private int numberOfSearches;

	public BookRating() {}
	public BookRating(double avgRating, int numberOfSearches) {
		super();
		this.avgRating = avgRating;
		this.numberOfSearches = numberOfSearches;
	}
	
	public BookRating(Integer bookId, double avgRating, int numberOfSearches) {
		super();
		this.bookId = bookId;
		this.avgRating = avgRating;
		this.numberOfSearches = numberOfSearches;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	public int getNumberOfSearches() {
		return numberOfSearches;
	}
	public void setNumberOfSearches(int numberOfSearches) {
		this.numberOfSearches = numberOfSearches;
	}
	
}
