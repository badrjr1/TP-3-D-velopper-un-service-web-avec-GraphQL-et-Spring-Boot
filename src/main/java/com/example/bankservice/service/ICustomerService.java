package com.example.bankservice.service;

import com.example.bankservice.dtos.customer.*;

import java.util.List;

public interface ICustomerService {
    List<CustomerDto> getAllCustomers();
    AddCustomerResponse createCustomer(AddCustomerRequest addCustomerRequest);
    UpdateCustomerResponse updateCustomer(String identityRef, UpdateCustomerRequest updateCustomerRequest);
    CustomerDto getCustomByIdentity(String identity);
    String deleteCustomerByIdentityRef(String identityRef);
}
