package edu.icet.srs.service;
import edu.icet.srs.dao.StudentPortalEntity;
import edu.icet.srs.dto.StudentPortal;
import edu.icet.srs.repository.StudentPortalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentPortalServiceImpl implements StudentPortalService{
    @Autowired
    StudentPortalRepository repository;
    @Override
    public void setStudentPortal(StudentPortal studentPortal) {
        StudentPortalEntity studentPortalEntity = new StudentPortalEntity();
        studentPortalEntity.setName(studentPortal.getName());
        studentPortalEntity.setUserName(studentPortal.getUserName());
        studentPortalEntity.setEmail(studentPortal.getEmail());
        studentPortalEntity.setFaculty(studentPortal.getFaculty());
        studentPortalEntity.setPassword(studentPortal.getPassword());

        repository.save(studentPortalEntity);
    }

    @Override
    public Iterable<StudentPortalEntity> getStudentPortal() {
        return repository.findAll();
    }

    public Iterable<StudentPortalEntity> retrieveStudentPortalByUserName(String userName){
        return repository.findAllByUserName(userName);
    }
}
