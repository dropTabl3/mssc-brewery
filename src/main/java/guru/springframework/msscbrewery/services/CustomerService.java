package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    void deleteById(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    CustomerDto saveNewCustomer(CustomerDto customerDto);
}
