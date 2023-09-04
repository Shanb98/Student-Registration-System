package edu.icet.srs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentPortal {
    private String name;
    private String userName;
    private String email;
    private String faculty;
    private String password;

    private String formFullName;
    private String formEmail;
    private String formPhone;
    private String formBirthday;
    private String formNic;
    private String formGender;
    private String formAddress;
    private String formCity;
    private String formZipcode;
    private String formRegistrationNumber;
    private String formFaculty;
    private String formSpecialization;
    private String formYear;
    private String formSemester;
}
