package com.app.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.core.entity.Contact;
import com.app.core.entity.Una_Employee;
import com.app.core.repository.UnaRepo;

@Service
public class UnaService {

	@Autowired
	private UnaRepo repo;
	
	public Una_Employee addEmployee(Una_Employee e) {
		return repo.save(e);
	}
	
	public List<Una_Employee> getAllEmployee(){
		return repo.findAll();
	}
	
	public Una_Employee getEmployeeById(int id) {
		return repo.findById(id);
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	public Una_Employee update(Una_Employee una_Employee) {
		una_Employee.setFirstName(una_Employee.getFirstName());
		una_Employee.setLastName(una_Employee.getLastName());
		//una_Employee.setMobileNo(una_Employee.getMobileNo());
		una_Employee.setContact(una_Employee.getContact());
		return repo.save(una_Employee);
	}

//	public Contact addContact(Contact contact) {
//		
//		return repo.save(contact);
//	}
}
