package Springcore_qn1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest_qn1 {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Springcore_qn1/config.xml");
		Customer cust = (Customer)context.getBean("customerConstructor");
		
		 
		Customer obj2 = new Customer(1, "Rahul", 9860782947L,new Address("xyz", "Pune", "Maharashtra", "442301", "India"));
		
		
		if (cust.getCustomerName().equals(obj2.getCustomerName())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
	}

}