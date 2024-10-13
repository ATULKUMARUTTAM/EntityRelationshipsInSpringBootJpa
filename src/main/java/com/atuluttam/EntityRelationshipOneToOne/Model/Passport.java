package com.atuluttam.EntityRelationshipOneToOne.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Passid;
    private String Country;


    //Uncomment Below line for Bidirectional OneToOne mapping
    @OneToOne(mappedBy = "passport",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Person person;

}
