package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

//	CustomerRepository customerRepository=new HibernateCustomerRepositoryImpl();
	

	CustomerRepository customerRepository;
	//default constructor for setter injection
	public CustomerServiceImpl() {
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("constructor inject");
		this.customerRepository=customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	// setter injection of bean
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter inject");
		this.customerRepository = customerRepository;
	}
}
