package edu.icet.srs.service;

import edu.icet.srs.dao.StudentPortalEntity;
import edu.icet.srs.dto.StudentPortal;

public interface StudentPortalService {
    void setStudentPortal(StudentPortal studentPortal);
    Iterable<StudentPortalEntity>getStudentPortal();
    public Iterable<StudentPortalEntity> retrieveStudentPortalByUserName(String userName);
    public  void updateStudentPortalById(Long id, StudentPortal request);
    void setAdminPortal(StudentPortal studentPortal);
    public Iterable<StudentPortalEntity> retrieveAdminByUserName(String adminUserName);
    public Iterable<StudentPortalEntity> retrieveByFormFullName(String formFullName);
    public String deleteStudent(Long id);
}
