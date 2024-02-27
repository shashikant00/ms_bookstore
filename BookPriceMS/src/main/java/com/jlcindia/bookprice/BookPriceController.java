package com.jlcindia.bookprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
public class BookPriceController {

	static Logger log=LoggerFactory.getLogger(BookPriceServiceImpl.class);
	
	@Autowired
	BookPriceService bookPriceService;
	
	@GetMapping("/bookPrice/{bookId}")
	@ApiOperation(value = "getBookPrice",response =BookPrice.class,
	notes = "Gives BookPrice Object of given bookId")
	public BookPrice getBookPrice(@PathVariable Integer bookId) {
		log.info("----BookPriceController-------getBookPrice()----");
		
		BookPrice bookPrice=bookPriceService.getBookPriceById(bookId);
		
		return bookPrice;
	}
	
	@GetMapping("/offeredPrice/{bookId}")
	@ApiOperation(value = "getOfferedPrice",response =double.class,
	notes = "Gives Offered Price of given bookId")
	public double getOfferdPrice(@PathVariable Integer bookId) {
		
		log.info("----BookPriceController-------getOfferdPrice()----");
		double offeredPrice=bookPriceService.getOfferedPriceById(bookId);
		
		return offeredPrice;
	}
}
