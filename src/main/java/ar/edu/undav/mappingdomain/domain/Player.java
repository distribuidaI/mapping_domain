package ar.edu.undav.mappingdomain.domain;

import javax.persistence.*;

@Entity
@Table(name = "concrete_player")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Player {

    @Id //porque es PK
    @TableGenerator(table = "sequences", name = "seq_generator", schema="mapping_domain", allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seq_generator")
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
