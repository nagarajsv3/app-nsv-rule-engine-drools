package com.nsv.jsmbaba.controller;

import com.nsv.jsmbaba.domain.Customer;
import com.nsv.jsmbaba.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/executecerules")
    public ResponseEntity<?> executecerules(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.executecerules(customer), HttpStatus.OK);
    }
}
