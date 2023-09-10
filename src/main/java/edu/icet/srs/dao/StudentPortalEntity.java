package edu.icet.srs.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentPortalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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

    private String adminName;
    private String adminUserName;
    private String adminDesignation;
    private String adminEmployeeId;
    private String adminEmail;
    private String adminFaculty;
    private String adminPassword;

    @Lob
    private byte[] imgData;
}
