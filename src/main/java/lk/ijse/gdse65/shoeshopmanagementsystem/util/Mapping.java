package lk.ijse.gdse65.shoeshopmanagementsystem.util;

import lk.ijse.gdse65.shoeshopmanagementsystem.dto.CustomerDTO;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.EmployeeDTO;
import lk.ijse.gdse65.shoeshopmanagementsystem.entity.CustomerEntity;
import lk.ijse.gdse65.shoeshopmanagementsystem.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {
    private final ModelMapper mapper;

    //CustomerMapping
    public CustomerDTO toCustomerDTO(CustomerEntity customer) {
        return  mapper.map(customer, CustomerDTO.class);
    }
    public CustomerEntity toCustomer(CustomerDTO customerDTO) {
        return  mapper.map(customerDTO, CustomerEntity.class);
    }
    public List<CustomerDTO> toCustomerDTOList(List<CustomerEntity> customers) {
        return mapper.map(customers, List.class);
    }

    public EmployeeDTO toEmployeeDTO(EmployeeEntity employee){
        return mapper.map(employee, EmployeeDTO.class);
    }

    public EmployeeEntity toEmployeeEntity(EmployeeDTO employeeDTO){
        return mapper.map(employeeDTO, EmployeeEntity.class);
    }

    public List<EmployeeDTO> toEmployeeDTOList(List<EmployeeEntity> entities){
        return mapper.map(entities, List.class);
    }
}
