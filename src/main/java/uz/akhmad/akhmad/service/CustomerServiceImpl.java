package uz.akhmad.akhmad.service;

import org.springframework.stereotype.Service;
import uz.akhmad.akhmad.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
            return CustomerDto.builder().id(UUID.randomUUID())
                    .name("Ahmadali")
                    .build();

    }
}
