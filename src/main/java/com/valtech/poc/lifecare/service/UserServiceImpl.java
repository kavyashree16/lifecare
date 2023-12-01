package com.valtech.poc.lifecare.service;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.poc.lifecare.entity.User;
import com.valtech.poc.lifecare.repository.UserRepo;

import jakarta.annotation.PostConstruct;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@PostConstruct
	public void populateUserDetails() {

		User details = new User("Dhanush", "dhanush.v.2001@gmail.com", "Dhanush@123",
				"9480208384", "123456789123", "SELLER");
		userRepo.save(details);

	}
	
	@Override
	public long countUserDetails() {

		return userRepo.count();
	}

	@Override
	public User createUserDetails(User userDetails) {

		return userRepo.save(userDetails);
	}

//	public User updateUserDetails(User userDetails) {
//
//		return userRepo.save(userDetails);
//	}

//	public void deleteUserDetails(int id) {
//
//		userRepo.deleteById(id);
//	}

//	public List<User> getAllUserDetails() {
//
//		return userRepo.findAll();
//	}

//	public User getUserDetails(int id) {
//
//		return userRepo.getReferenceById(id);
//	}
}
