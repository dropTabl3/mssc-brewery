package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Jhon")
                .build();
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("beer deleted id: " + customerId);
    }

    @Override
    public void updateBeer(UUID customerId, CustomerDto customerDto) {
        //TODO real implementation
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Jhon")
                .build();
    }
}
