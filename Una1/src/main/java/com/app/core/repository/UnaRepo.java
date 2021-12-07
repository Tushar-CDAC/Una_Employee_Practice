package com.app.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.core.entity.Contact;
import com.app.core.entity.Una_Employee;

public interface UnaRepo extends CrudRepository<Una_Employee, Integer> {
	
	List<Una_Employee> findAll();
	Una_Employee findById(int id);
//	Una_Employee save(int id);
	void deleteById(int id);
//	Contact save(Contact contact);
}
