package app.models;

import javax.persistence.Entity;

@Entity
public class Sample extends Model {

    private String name;

    public String getName() {

        return name;
    }

    public void setName(final String name) {

        this.name = name;
    }
}
