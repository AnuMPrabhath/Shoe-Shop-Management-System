package lk.ijse.gdse65.shoeshopmanagementsystem.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.enums.Gender;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.enums.Roles;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity implements SuperEntity{
    @Id
    private String EmployeeCode;
    private String EmployeeName;
    private String EmployeeProfilePic;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String designation;
    @Enumerated(EnumType.STRING)
    private Roles accessRoles;
    private Date dob;
    private Date dateOfJoin;
    private String attachedBranch;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String contactNo;
    private String email;
    private String guardianOrNominatedPerson;
    private String emergencyContact;
}
