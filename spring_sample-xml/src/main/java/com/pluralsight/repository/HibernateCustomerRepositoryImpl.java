package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private String dbUserName;
	
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	@Override
	public List<Customer> findAll(){
		
		System.out.println(dbUserName);
		
		List<Customer> customers=new ArrayList<Customer>();
		Customer customer= new Customer();
		customer.setFirstName("pavan");
		customer.setLastName("acharya");
		customers.add(customer);
		return customers;
	}

}
