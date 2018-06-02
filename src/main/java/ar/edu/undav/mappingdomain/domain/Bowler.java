package ar.edu.undav.mappingdomain.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Bowler extends Cricketer{

    @Column(name = "bowling_avg")
    private Float bowlingAverage;

    public Bowler(String name, Float battingAverage, Float bowlingAverage) {
        super(name, battingAverage);
        this.bowlingAverage = bowlingAverage;
    }

    public Float getBowlingAverage() {
        return bowlingAverage;
    }
}
