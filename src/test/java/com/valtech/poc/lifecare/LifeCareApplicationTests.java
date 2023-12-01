package com.valtech.poc.lifecare;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.poc.lifecare.service.UserService;

@SpringBootTest
class LifeCareApplicationTests {

	@Autowired
	private UserService serviceDAO;

	

	@Test
	void testLifeCareServiceDAO() {

		assertEquals(1, serviceDAO.countUserDetails());
	}

}
