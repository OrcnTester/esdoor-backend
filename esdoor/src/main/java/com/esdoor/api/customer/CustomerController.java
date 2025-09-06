package com.esdoor.api.customer;

import com.esdoor.core.customer.Customer;
import com.esdoor.core.customer.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerRepository repo;
    public CustomerController(CustomerRepository repo) { this.repo = repo; }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer c) {
        return ResponseEntity.ok(repo.save(c));
    }

    @GetMapping
    public List<Customer> all() { return repo.findAll(); }
}
