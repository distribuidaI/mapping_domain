package ar.edu.undav.mappingdomain.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cricketer extends Player {

    @Column(name = "batting_avg")
    protected Float battingAverage;

    public Cricketer(String name, Float battingAverage) {
        super(name);
        this.battingAverage = battingAverage;
    }

    public Float getBattingAverage() {
        return battingAverage;
    }
}
