package com.huynhbaoloc.service.impl;

import com.huynhbaoloc.entity.Customer;
import com.huynhbaoloc.reponsitory.CustomerReponsitory;
import com.huynhbaoloc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerReponsitory customerReponsitory;

    @Override
    public List<Customer> getCustomer() {
        return customerReponsitory.findAll();
    }
}
