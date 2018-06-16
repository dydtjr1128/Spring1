package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	Map<String, Customer> customerMap;
	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		addCustomer(new Customer("id001", "password001", "Yongseok"));
		addCustomer(new Customer("id002", "password002", "bob"));
		addCustomer(new Customer("id003", "password003", "charile"));
		addCustomer(new Customer("id004", "password004", "david"));
		addCustomer(new Customer("id005", "password005", "tomas"));
	}
	public Customer findCustomer(String customer_id) {
		if(customer_id != null) {
			return (customerMap.get(customer_id.toLowerCase()));
		}
		else {
			return null;
		}
	}
	public void addCustomer(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}
}
