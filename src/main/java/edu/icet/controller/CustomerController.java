package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import edu.icet.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    @Autowired
    final CustomerService service;
    @GetMapping("/get-customer")
    public Customer getCustomer(){
        return new Customer(1,"saman","panadura","saman@gmail.com");
    }
    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }
}
