package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
     @GetMapping("/")
	public Customer getCustomer() {
		
		  Customer c= new Customer();
		  c.setId(101);
		  c.setName("geeta");
		  c.setEmail("lipsa4645@gmail.com");
		  c.setPhno(59585999);
		  
		  return c;
	}

}
