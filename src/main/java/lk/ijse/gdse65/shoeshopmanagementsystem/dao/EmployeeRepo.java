package lk.ijse.gdse65.shoeshopmanagementsystem.dao;

import lk.ijse.gdse65.shoeshopmanagementsystem.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {
    EmployeeEntity findFirstByOrderByEmployeeCodeDesc();
}
