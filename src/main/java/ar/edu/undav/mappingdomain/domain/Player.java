package ar.edu.undav.mappingdomain.domain;

import javax.persistence.*;

@Entity
@Table(name = "si_player")
@DiscriminatorColumn(name = "type",  discriminatorType = DiscriminatorType.STRING)
public class Player {

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
