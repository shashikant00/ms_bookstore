package com.jlcindia.bookstoreweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreWebApplication {

	static Logger log=LoggerFactory.getLogger(BookStoreWebApplication.class);
	
	public static void main(String[] args) {
		log.info("BookStoreWebMS - Begin");
		SpringApplication.run(BookStoreWebApplication.class, args);
		log.info("BookStoreWebMS - End");
	}
}
