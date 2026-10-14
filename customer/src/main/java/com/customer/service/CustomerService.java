package com.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.dto.Customer;
import com.customer.model.CustomerModel;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll()
                .stream()
                .map(CustomerModel::toDto)
                .toList();
    }
}