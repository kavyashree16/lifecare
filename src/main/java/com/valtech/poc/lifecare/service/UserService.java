package com.valtech.poc.lifecare.service;

import com.valtech.poc.lifecare.entity.User;

public interface UserService {
	
	long countUserDetails();

	User createUserDetails(User userDetails);

}