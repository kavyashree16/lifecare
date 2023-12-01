package com.valtech.poc.lifecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.poc.lifecare.entity.LifeCareUserDetails;

@Repository
public interface LifeCareUserRepository extends JpaRepository<LifeCareUserDetails, Integer> {

}
