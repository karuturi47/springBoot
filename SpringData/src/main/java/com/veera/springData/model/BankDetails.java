/**
 * 
 */
package com.veera.springData.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * @author Veera
 *
 */
@Entity
@Table(name = "BANK_DETAILS")
public class BankDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BANK_ID")
	private Long bankId;
	@Column(name = "ACCT_NUMBER")
	private String accountNumber;
	@Column(name = "BANK_NAME")
	private String bankName;
	@Column(name = "BANK_LOCATION")
	private String bankLocation;
	@Column(name = "PHONE_NUMBER")
	private String bankPhone;
	private Person person;	
	@ManyToOne
	public Person getPerson()
	{
		return person;
	}


	public BankDetails() {
	}

	public BankDetails(String accountNumber, String bankName, String bankLocation, String bankPhone) {
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.bankLocation = bankLocation;
		this.bankPhone = bankPhone;
		
	}

//	@ManyToOne
//	private Person person;

	/**
	 * @return the bankId
	 */
	public Long getBankId() {
		return bankId;
	}

	/**
	 * @param bankId
	 *            the bankId to set
	 */
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName
	 *            the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the bankLocation
	 */
	public String getBankLocation() {
		return bankLocation;
	}

	/**
	 * @param bankLocation
	 *            the bankLocation to set
	 */
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	/**
	 * @return the bankPhone
	 */
	public String getBankPhone() {
		return bankPhone;
	}

	/**
	 * @param bankPhone
	 *            the bankPhone to set
	 */
	public void setBankPhone(String bankPhone) {
		this.bankPhone = bankPhone;
	}
}
