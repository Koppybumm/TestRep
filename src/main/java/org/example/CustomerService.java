package org.example;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    private List<Customer> customers;
    public CustomerService() {}

    public Optional<Customer> findCustomerById(String id) {
        return customers.stream().filter(customer -> customer.customerId().equals(id)).findFirst();
    }

    public String getCustomerNameUppercase(String id) {
        Optional<Customer> customer = findCustomerById(id);
        return customer.map(customer1 -> customer1.name().toUpperCase()).orElse("UNKOWN");
    }

    public Customer findCustomerOrThrow(String id) {
        Optional<Customer> customer = findCustomerById(id);
        return customer.orElseThrow(() -> new IllegalArgumentException("bischt deppert?"));
    }

}
