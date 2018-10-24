package ar.edu.undav.mappingdomain.domain;

import javax.persistence.*;

@Entity
@Table(name="tpc_footballer")
@Inheritance(strategy = InheritanceType.JOINED)
public class Footballer extends Player {

    private String club;

    public Footballer(String name, String club) {
        super(name);
        this.club = club;
    }

    public String getClub() {
        return club;
    }
}
