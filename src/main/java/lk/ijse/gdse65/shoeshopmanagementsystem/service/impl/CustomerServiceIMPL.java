package lk.ijse.gdse65.shoeshopmanagementsystem.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse65.shoeshopmanagementsystem.dao.CustomerRepo;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.CustomerDTO;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.enums.Gender;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.enums.Level;
import lk.ijse.gdse65.shoeshopmanagementsystem.entity.CustomerEntity;
import lk.ijse.gdse65.shoeshopmanagementsystem.service.CustomerService;
import lk.ijse.gdse65.shoeshopmanagementsystem.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceIMPL implements CustomerService {
    private final CustomerRepo repo;
    private final Mapping mapping;
    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return mapping.toCustomerDTO(repo.save(mapping.toCustomer(customerDTO)));
    }

    @Override
    public void deleteCustomer(String customerCode) {
        repo.deleteById(customerCode);
    }

    @Override
    public CustomerDTO getSelectedCustomer(String customerCode) {
        return mapping.toCustomerDTO(repo.getReferenceById(customerCode));
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return mapping.toCustomerDTOList(repo.findAll());
    }

    @Override
    public void updateCustomer(String customerCode, CustomerDTO customerDTO) {
        CustomerEntity existCustomer = repo.findById(customerCode).orElse(null);
        if (existCustomer != null){
            existCustomer.setCustomerName(customerDTO.getCustomerName());
            existCustomer.setGender(Gender.valueOf(customerDTO.getGender()));
            existCustomer.setJoinDate(customerDTO.getJoinDate());
            existCustomer.setLevel(Level.valueOf(customerDTO.getLevel()));
            existCustomer.setTotalPoints(customerDTO.getTotalPoints());
            existCustomer.setDob(customerDTO.getDob());
            existCustomer.setAddressLine01(customerDTO.getAddressLine01());
            existCustomer.setAddressLine02(customerDTO.getAddressLine02());
            existCustomer.setAddressLine03(customerDTO.getAddressLine03());
            existCustomer.setAddressLine04(customerDTO.getAddressLine04());
            existCustomer.setAddressLine05(customerDTO.getAddressLine05());
            existCustomer.setContactNo(customerDTO.getContactNo());
            existCustomer.setEmail(customerDTO.getEmail());
            existCustomer.setRecentPurchaseDate(customerDTO.getRecentPurchaseDate());
        }
    }

    private String getNextCustomerCode() {
        CustomerEntity firstByOrderByCustomerCodeDesc = repo.findFirstByOrderByCustomerCodeDesc();
        return (firstByOrderByCustomerCodeDesc != null)
                ? String.format("Cust-%03d",
                Integer.parseInt(firstByOrderByCustomerCodeDesc.getCustomerCode().replace("Cust-", "")) + 1) : "Cust-001";
    }
}
