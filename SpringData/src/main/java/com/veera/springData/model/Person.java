/**
 * 
 */
package com.veera.springData.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * @author Veera
 *
 */
@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PERSON_ID")
	private Long id;
	@Column(name = "F_NAME")
	private String fName;
	@Column(name = "L_NAME")
	private String lName;
	@Column(name = "M_NAME")
	private String mName;
	@Column(name = "PHONE_NUMBER")
	private String PhoneNumber;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "SSN")
	private String ssn;

	@OneToMany
	private List<BankDetails> bankDetails;
	
	public List<BankDetails> getBankDetails(){
		return bankDetails;
	}

	public Person() {
	}

	public Person(String fName, String lName, String mName, String PhoneNumber, String email, String ssn) {
		this.fName = fName;
		this.lName = lName;
		this.mName = mName;
		this.PhoneNumber = PhoneNumber;
		this.email = email;
		this.ssn = ssn;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName
	 *            the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName
	 *            the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}

	/**
	 * @param mName
	 *            the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

//	/**
//	 * @return the bankDetails
//	 */
//	public Set<BankDetails> getBankDetails() {
//		return bankDetails;
//	}
//
//	/**
//	 * @param bankDetails the bankDetails to set
//	 */
//	public void setBankDetails(Set<BankDetails> bankDetails) {
//		this.bankDetails = bankDetails;
//	}

	

}
