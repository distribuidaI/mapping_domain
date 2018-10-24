package ar.edu.undav.mappingdomain.domain;

import javax.persistence.*;

@Entity
@Table(name = "tpc_player")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Player {

    @Id //porque es PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //es porque tiene que ser auto-increment o sequence
    protected Long id;

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
