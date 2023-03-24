package tn.esprit.kaddemproject.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddemproject.Entites.University;

@Repository
public interface UniversityRepo extends CrudRepository<University,Integer> {
    University findByNomUniversity(String nomUniversity);

}

