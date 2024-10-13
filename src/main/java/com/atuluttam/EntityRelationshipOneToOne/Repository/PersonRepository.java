package com.atuluttam.EntityRelationshipOneToOne.Repository;

import com.atuluttam.EntityRelationshipOneToOne.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
