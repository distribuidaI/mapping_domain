package ar.edu.undav.mappingdomain.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
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
