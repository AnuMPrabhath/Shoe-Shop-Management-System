package lk.ijse.gdse65.shoeshopmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class CustomerEntity implements SuperEntity{
    @Id
    private String customerCode;
    private String customerName;
    @Enumerated(EnumType.STRING)
    private String gender;
    private Date joinDate;
    @Enumerated(EnumType.STRING)
    private String level;
    private Integer totalPoints;
    private Date dob;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String contactNo;
    private String email;
    private Timestamp RecentPurchaseDate;
}
