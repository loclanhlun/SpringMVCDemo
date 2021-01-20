package com.huynhbaoloc.controller;


import com.huynhbaoloc.entity.Customer;
import com.huynhbaoloc.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List<Customer> theCustomers = iCustomerService.getCustomer();
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }
}
