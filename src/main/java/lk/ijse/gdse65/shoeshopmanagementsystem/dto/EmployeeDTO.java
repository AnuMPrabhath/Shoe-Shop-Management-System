package lk.ijse.gdse65.shoeshopmanagementsystem.dto;

import lk.ijse.gdse65.shoeshopmanagementsystem.dto.enums.Gender;
import lk.ijse.gdse65.shoeshopmanagementsystem.dto.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String EmployeeCode;
    private String EmployeeName;
    private String EmployeeProfilePic;
    private Gender gender;
    private String status;
    private String designation;
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
