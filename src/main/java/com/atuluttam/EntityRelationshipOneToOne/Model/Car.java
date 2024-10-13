package com.atuluttam.EntityRelationshipOneToOne.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    private String CarNumber;
    private String CarModel;


    //    Many Cars → One Person
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "Id", nullable = false)
    private Person person;

    //@ManyToOne: Defines the Many-to-One relationship from Car to Person.
    // This side is the owning side of the relationship, meaning the person
    // field in Car holds the foreign key to the Person table.

}
