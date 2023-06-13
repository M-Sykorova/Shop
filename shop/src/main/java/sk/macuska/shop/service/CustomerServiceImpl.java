package sk.macuska.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.macuska.shop.model.Customer;
import sk.macuska.shop.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }
}
