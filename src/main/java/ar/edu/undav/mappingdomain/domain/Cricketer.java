package ar.edu.undav.mappingdomain.domain;

import javax.persistence.*;

@Entity
@Table(name="tpc_cricketer")
@Inheritance(strategy = InheritanceType.JOINED)
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
