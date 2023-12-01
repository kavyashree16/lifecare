package com.valtech.poc.lifecare;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.poc.lifecare.service.LifeCareServiceDAO;

@SpringBootTest
class LifeCareApplicationTests {

	@Autowired
	private LifeCareServiceDAO serviceDAO;

	@Test
	void contextLoads() {

		System.out.println("Hello World!!");
	}

	@Test
	void testLifeCareServiceDAO() {

		assertEquals(1, serviceDAO.countUserDetails());
	}

}
