/**
 * 
 */
package springBootApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springBootApp.model.Customer;

/**
 * @author Veera
 *
 */
public interface CustomerRepo extends JpaRepository<Customer, Long> {
	
	
		public Customer findById(Long Id);
}
