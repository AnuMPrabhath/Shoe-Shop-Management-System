package lk.ijse.gdse65.shoeshopmanagementsystem.service;

import lk.ijse.gdse65.shoeshopmanagementsystem.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String customerCode);
    CustomerDTO getSelectedCustomer(String customerCode);
    List<CustomerDTO> getAllCustomers();
    void updateCustomer(String customerCode,CustomerDTO customerDTO);
}
