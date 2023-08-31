package edu.icet.srs.service;

import edu.icet.srs.dao.StudentPortalEntity;
import edu.icet.srs.dto.StudentPortal;

public interface StudentPortalService {
    void setStudentPortal(StudentPortal studentPortal);
    Iterable<StudentPortalEntity>getStudentPortal();
    public Iterable<StudentPortalEntity> retrieveStudentPortalByUserName(String userName);
}