package com.valtech.poc.lifecare.service;

import com.valtech.poc.lifecare.entity.LifeCareUserDetails;

public interface LifeCareServiceDAO {
	
	long countUserDetails();

	LifeCareUserDetails createUserDetails(LifeCareUserDetails userDetails);

}