package com.example.demo.bootstrap;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.activation.CommandObject;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer c1=new Customer();
        c1.setFirstName("Myint");
        c1.setLastName("Myint");
        customerRepository.save(c1);

        Customer c2=new Customer();
        c2.setFirstName("Myint");
        c2.setLastName("Myint");
        customerRepository.save(c2);

        Customer c3=new Customer();
        c3.setFirstName("Myint");
        c3.setLastName("Myint");
        customerRepository.save(c3);

        System.out.println("Customer Save"+customerRepository.count());


    }
}
