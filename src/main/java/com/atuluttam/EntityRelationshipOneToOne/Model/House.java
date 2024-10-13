package com.atuluttam.EntityRelationshipOneToOne.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {

    @Id
    private Integer Hno;
    private String city;
    private String country;


    @ManyToMany
    private List<Person> persons;
}
