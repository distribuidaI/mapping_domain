package ar.edu.undav.mappingdomain.domain;

import javax.persistence.*;

@Entity
@Table(name = "concrete_bowler")
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
