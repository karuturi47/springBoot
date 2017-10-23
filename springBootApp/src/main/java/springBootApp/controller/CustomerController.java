/**
 * 
 */
package springBootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springBootApp.model.Customer;
import springBootApp.repo.CustomerRepo;

/**
 * @author Veera
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	@RequestMapping("/findAllCustomer")
	@ResponseBody
	public List<Customer> findAll(){
		
		return customerRepo.findAll();
		
	}
	
	@RequestMapping("/findCustomerById/{id}")
	@ResponseBody
	public Customer findCustomerById(@PathVariable("id") Long id){
		
		return customerRepo.findById(id);
		
	}
	
	@RequestMapping(value="/saveCustomer/{name}/{phone}", method=RequestMethod.POST)
	public Customer saveCustomer(@PathVariable("name") String name,@PathVariable("phone") String phoneNumber){
		Customer cus=new Customer();
		cus.setName(name);
		cus.setPhone(phoneNumber);
		return customerRepo.save(cus);
		
	}
	
	@RequestMapping(value="/deleteCustomer/{id}", method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("id") Long id)
	{
		customerRepo.delete(id);
	}
	
	@RequestMapping(value="/update/{id}/{name}/{phone}", method=RequestMethod.PUT)
	public String updateCustomer(@PathVariable("id") Long id,@PathVariable("name") String name,@PathVariable("phone") String phoneNumber){
		Customer cus=customerRepo.findById(id);
		if(cus!=null)
		{
			cus.setId(id);
			cus.setName(name);
			cus.setPhone(phoneNumber);	
			customerRepo.save(cus);
			return "Sucess";
		}
		else
		{
			return "failure";
		}
		
	}
	

}
