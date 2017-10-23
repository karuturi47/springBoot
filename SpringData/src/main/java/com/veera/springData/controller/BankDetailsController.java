/**
 * 
 */
package com.veera.springData.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veera.springData.model.BankDetails;
import com.veera.springData.repositories.BankDetailsRepository;

/**
 * @author Veera
 *
 */
@RestController
@RequestMapping("/bankSerivce")
public class BankDetailsController {

	@RequestMapping("/findByName/{name}")
	public BankDetails findByBankName(@Param("name") String name) {
		return bankRepository.findBankDetailsByBankName(name);
	}

	@RequestMapping("/findAllBankDetails")
	public List<BankDetails> findByBankName() {
		List<BankDetails> bankDetails = new ArrayList<BankDetails>();
		for (BankDetails bankDetail : bankRepository.findAll()) {
			bankDetails.add(bankDetail);
		}

		return bankDetails;
	}

	@RequestMapping("/saveBankDetails")
	public void addBankDetails(BankDetails bankDetails) {
		bankRepository.save(bankDetails);

	}

	@Autowired
	private BankDetailsRepository bankRepository;

}
