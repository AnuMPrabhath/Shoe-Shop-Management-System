package lk.ijse.gdse65.shoeshopmanagementsystem.controller;

import lk.ijse.gdse65.shoeshopmanagementsystem.dto.CustomerDTO;
import lk.ijse.gdse65.shoeshopmanagementsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping("/health")
    public String healthTest(){
        return "CustomerHealth Test";
    }

    @PostMapping
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customer){
        return customerService.saveCustomer(customer);
    }
    /*@ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveCustomer(@Validated @RequestBody CustomerDTO customerDTO,
                                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).
                    body(bindingResult.getFieldErrors().get(0).getDefaultMessage());
        }

        try {
            customerService.saveCustomer(customerDTO);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Customer Details saved Successfully.");
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body("Internal server error | Customer saved Unsuccessfully.\nMore Details\n"+exception);
        }
    }*/

    @DeleteMapping(value = "/{customerCode}")
    public void deleteCustomer(@PathVariable ("customerCode") String customerCode){
        customerService.deleteCustomer(customerCode);
    }

    @GetMapping
    List<CustomerDTO> getAll(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/{id}")
    CustomerDTO getCustomerById(@PathVariable("id") String id){
        return customerService.getSelectedCustomer(id);
    }

    @PutMapping
    void updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.updateCustomer(customerDTO.getCustomerCode() ,customerDTO);
    }
}
