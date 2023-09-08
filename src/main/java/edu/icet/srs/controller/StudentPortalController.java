package edu.icet.srs.controller;

import edu.icet.srs.dao.StudentPortalEntity;
import edu.icet.srs.dto.StudentPortal;
import edu.icet.srs.service.StudentPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/StudentPortal")
public class StudentPortalController {
    @Autowired
    StudentPortalService studentPortalService;
    @PostMapping
    public void setStudentPortal(@RequestBody StudentPortal studentPortal){
        studentPortalService.setStudentPortal(studentPortal);
    }

    @GetMapping
    Iterable<StudentPortalEntity> getStudentPortal(){
        return studentPortalService.getStudentPortal();
    }
    @GetMapping("/{userName}")
    Iterable<StudentPortalEntity> retrieveStudentPortalByUserName(
        @PathVariable String userName){

        return studentPortalService.retrieveStudentPortalByUserName(userName);
    }
    @PutMapping("/{id}")
    public void updateStudentPortalById(@PathVariable Long id, @RequestBody StudentPortal request) {
        studentPortalService.updateStudentPortalById(id, request);
    }

    @PostMapping("/admin")
    public void setAdminPortal(@RequestBody StudentPortal studentPortal){
        studentPortalService.setAdminPortal(studentPortal);
    }
    @GetMapping("/admin/{adminUserName}")
    Iterable<StudentPortalEntity> retrieveAdminByUserName(
            @PathVariable String adminUserName){

        return studentPortalService.retrieveAdminByUserName(adminUserName);
    }
    @GetMapping("/form/{formFullName}")
    Iterable<StudentPortalEntity> retrieveByFormFullName(
            @PathVariable String formFullName){

        return studentPortalService.retrieveByFormFullName(formFullName);
    }
}
