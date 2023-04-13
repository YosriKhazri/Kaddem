package tn.esprit.kaddemproject.Entites;

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontrat")
    long idContratRepo;
}
