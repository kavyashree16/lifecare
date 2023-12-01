package com.valtech.poc.lifecare.service;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.poc.lifecare.entity.LifeCareUserDetails;
import com.valtech.poc.lifecare.repository.LifeCareUserRepository;

import jakarta.annotation.PostConstruct;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class LifeCareServiceImpl implements LifeCareServiceDAO {

	@Autowired
	private LifeCareUserRepository lifeCareUserRepository;

	@PostConstruct
	public void populateUserDetails() {

		LifeCareUserDetails details = new LifeCareUserDetails("Dhanush", "dhanush.v.2001@gmail.com", "Dhanush@123",
				"9480208384", "123456789123", "SELLER");
		lifeCareUserRepository.save(details);

	}
	
	@Override
	public long countUserDetails() {

		return lifeCareUserRepository.count();
	}

	@Override
	public LifeCareUserDetails createUserDetails(LifeCareUserDetails userDetails) {

		return lifeCareUserRepository.save(userDetails);
	}

//	public LifeCareUserDetails updateUserDetails(LifeCareUserDetails userDetails) {
//
//		return lifeCareUserRepository.save(userDetails);
//	}

//	public void deleteUserDetails(int id) {
//
//		lifeCareUserRepository.deleteById(id);
//	}

//	public List<LifeCareUserDetails> getAllUserDetails() {
//
//		return lifeCareUserRepository.findAll();
//	}

//	public LifeCareUserDetails getUserDetails(int id) {
//
//		return lifeCareUserRepository.getReferenceById(id);
//	}
}
