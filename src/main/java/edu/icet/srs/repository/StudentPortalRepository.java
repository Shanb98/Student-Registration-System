package edu.icet.srs.repository;

import edu.icet.srs.dao.StudentPortalEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentPortalRepository
        extends CrudRepository<StudentPortalEntity,Long> {

    Iterable<StudentPortalEntity> findAllByUserName(String userName);

}
