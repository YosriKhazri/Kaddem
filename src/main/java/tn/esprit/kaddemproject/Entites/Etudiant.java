package tn.esprit.kaddemproject.Entites;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class Etudiant {
    @Entity
    @Table(name="etudiant")
    @FieldDefaults(level = AccessLevel.PRIVATE )
    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class Etudiant implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idEtudiant;
        String nomE;
        String prenomE;
        @Enumerated(EnumType.STRING)
        domaine domaine;

        @OneToMany(mappedBy = "e")
        List<Contrat> contrats;

        @ManyToOne
        Departement d;

        @ManyToMany
        List<Equipe> equipes;


    }
