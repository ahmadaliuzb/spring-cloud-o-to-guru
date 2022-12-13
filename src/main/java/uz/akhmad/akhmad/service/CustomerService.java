package uz.akhmad.akhmad.service;

import uz.akhmad.akhmad.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
