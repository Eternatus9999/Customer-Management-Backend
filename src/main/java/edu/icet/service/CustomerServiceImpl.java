package edu.icet.service;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repositoruy.CustomerRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteCustomerById(Integer id) {

    }

    @Override
    public Customer searchCustomerById(Integer id) {
        return null;
    }

    @Override
    public void updateCustomerById(Customer customer) {

    }
}
