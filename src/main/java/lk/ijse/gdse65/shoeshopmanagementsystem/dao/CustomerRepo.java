package lk.ijse.gdse65.shoeshopmanagementsystem.dao;

import lk.ijse.gdse65.shoeshopmanagementsystem.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity ,String> {
}
