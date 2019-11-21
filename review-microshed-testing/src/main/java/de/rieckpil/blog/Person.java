package de.rieckpil.blog;

import javax.json.JsonObject;
import javax.persistence.*;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class Person {

    @Id
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    public Person() {
    }

    public Person(JsonObject jsonObject) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.firstName = jsonObject.getString("firstName", "not provided");
        this.lastName = jsonObject.getString("lastName", "not provided");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
