package com.atuluttam.EntityRelationshipOneToOne.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String age;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PID", referencedColumnName = "Passid")
    private Passport passport;



    //One Person → Many Cars
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Car> cars;

 //   The mappedBy = "person" specifies that this is the inverse side of the
    //   relationship, and the person field in the Car entity owns the relationship

    @ManyToMany(mappedBy = "persons", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<House> houses;


}
