package com.app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.entity.Contact;
import com.app.core.entity.Una_Employee;
import com.app.core.service.UnaService;

@RestController
@RequestMapping("/una")
public class UnaController {

	@Autowired
	private UnaService service;

	@PostMapping("/add")
	public ResponseEntity<Una_Employee> addEmp(@RequestBody Una_Employee emp) {
		return new ResponseEntity<>(service.addEmployee(emp), HttpStatus.OK); 
	}
	
//	@PostMapping("/addContact")
//	public ResponseEntity<Contact> addContact(Contact contact) {
//		return new ResponseEntity<>(service.addContact(contact), HttpStatus.OK); 
//	}
	

	@GetMapping("/get/{id}")
	public ResponseEntity<Una_Employee > getEmpById(@PathVariable("id") int id) {
		return new ResponseEntity<> (service.getEmployeeById(id), HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Una_Employee>> getEmp() {
		return new ResponseEntity<> (service.getAllEmployee(), HttpStatus.OK);
	}

//	@DeleteMapping("/delete/{id}")
//	public void deleteById(@PathVariable ("id") int id) {
//		service.deleteById(id);
//	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable ("id") int id) {
		service.deleteById(id);
	}

	@PutMapping("/update")
	public ResponseEntity<Una_Employee> update(@RequestBody Una_Employee una_Employee )
	{
		return new ResponseEntity<>(service.update(una_Employee), HttpStatus.OK);
	}

	
}
