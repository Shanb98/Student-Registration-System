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



    @Override
    public void updateStudentPortalById(Long id, StudentPortal request) {
        StudentPortalEntity existingStudentPortal = repository.findById(id).get();

        existingStudentPortal.setFormFullName(request.getFormFullName());
        existingStudentPortal.setFormEmail(request.getFormEmail());
        existingStudentPortal.setFormPhone(request.getFormPhone());
        existingStudentPortal.setFormBirthday(request.getFormBirthday());
        existingStudentPortal.setFormNic(request.getFormNic());
        existingStudentPortal.setFormGender(request.getFormGender());
        existingStudentPortal.setFormAddress(request.getFormAddress());
        existingStudentPortal.setFormCity(request.getFormCity());
        existingStudentPortal.setFormZipcode(request.getFormZipcode());
        existingStudentPortal.setFormRegistrationNumber(request.getFormRegistrationNumber());
        existingStudentPortal.setFormFaculty(request.getFormFaculty());
        existingStudentPortal.setFormSpecialization(request.getFormSpecialization());
        existingStudentPortal.setFormYear(request.getFormYear());
        existingStudentPortal.setFormSemester(request.getFormSemester());

        repository.save(existingStudentPortal);

    }


}
