package tn.esprit.kaddemproject.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.kaddemproject.Entites.Equipe;

public interface EquipeRepo extends CrudRepository<Equipe,Integer> {

    public int x();
}
