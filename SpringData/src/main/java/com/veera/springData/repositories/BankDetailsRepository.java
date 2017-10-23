/**
 * 
 */
package com.veera.springData.repositories;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.veera.springData.model.BankDetails;

/**
 * @author Veera
 *
 */
@RepositoryRestResource
@Transactional
public interface BankDetailsRepository extends CrudRepository<BankDetails,Long>{
	
	
	public BankDetails findBankDetailsById(Long bankId);
	
	
	public BankDetails findBankDetailsByBankName(String bankName);
	
	
	
}
