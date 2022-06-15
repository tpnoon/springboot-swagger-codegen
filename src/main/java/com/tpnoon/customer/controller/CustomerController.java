package com.tpnoon.customer.controller;

import com.tpnoon.customer.api.CustomersApi;
import com.tpnoon.customer.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements CustomersApi {

    @Override
    public ResponseEntity<Customer> customersPost(Customer customer) {
        return ResponseEntity.accepted().body(customer);
    }
}
