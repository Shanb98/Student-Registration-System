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
}
