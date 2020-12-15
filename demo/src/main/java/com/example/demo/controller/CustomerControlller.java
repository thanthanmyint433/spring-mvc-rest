package com.example.demo.controller;

import com.example.demo.domain.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerControlller.BASE_URL)
public class CustomerControlller {
    public  static final String BASE_URL="/api/v1/customers";
    private final CustomerService customerService;

    public CustomerControlller(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    List<Customer> getAllCustomer(){
        return  customerService.findAllCustomer();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody  Customer customer){
        return customerService.saveCustomer(customer);
    }
}
