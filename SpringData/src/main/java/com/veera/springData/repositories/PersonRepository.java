/**
 * 
 */
package com.veera.springData.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.veera.springData.model.Person;

/**
 * @author Veera
 *
 */
@RepositoryRestResource
@Transactional
public interface PersonRepository extends CrudRepository<Person, Long>{
	
	public Person findById(Long Id);
	
	
	//public Person findBankDetailsByBankName(String name);
	

}
