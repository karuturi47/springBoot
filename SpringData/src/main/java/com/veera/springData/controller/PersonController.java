/**
 * 
 */
package com.veera.springData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veera.springData.model.Person;
import com.veera.springData.repositories.PersonRepository;


/**
 * @author Veera
 *
 */
@RestController
@RequestMapping("/personService")
public class PersonController {
	
	@RequestMapping("/getPersonById/{id}")
	public Person findPersonById(@Param("id") Long id) {
		Person person=personRepository.findById(id);
		person.setfName("veera");
		person.setlName("karuturi");
		person.setmName("V");
		person.setPhoneNumber("123456789");
		person.setSsn("789456321");
		
		return person;
		
	}
	
	
	@Autowired
	private PersonRepository  personRepository;

}
