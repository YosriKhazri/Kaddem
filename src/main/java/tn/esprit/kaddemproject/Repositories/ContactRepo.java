package tn.esprit.kaddemproject.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddemproject.Entites.Contact;


@Repository
public interface ContactRepo extends CrudRepository<Contact,Long> {
}
