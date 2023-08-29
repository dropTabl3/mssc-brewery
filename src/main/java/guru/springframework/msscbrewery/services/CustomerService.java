package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    void deleteCustomer(UUID customerId);

    void updateBeer(UUID customerId, CustomerDto customerDto);

    CustomerDto saveNewCustomer(CustomerDto customerDto);
}
