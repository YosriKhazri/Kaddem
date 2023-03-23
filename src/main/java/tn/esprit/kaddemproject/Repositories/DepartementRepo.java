package tn.esprit.kaddemproject.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddemproject.Entites.Departement;
@Repository
public interface DepartementRepo extends CrudRepository<Departement,Long>{

}
