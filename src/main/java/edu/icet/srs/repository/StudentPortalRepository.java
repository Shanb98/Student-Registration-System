package edu.icet.srs.repository;

import edu.icet.srs.dao.StudentPortalEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface StudentPortalRepository
        extends CrudRepository<StudentPortalEntity,Long> {

    Iterable<StudentPortalEntity> findAllByUserName(String userName);
    Optional<StudentPortalEntity> findById(Long id);
    Iterable<StudentPortalEntity> findAllByAdminUserName(String adminUserName);

}
