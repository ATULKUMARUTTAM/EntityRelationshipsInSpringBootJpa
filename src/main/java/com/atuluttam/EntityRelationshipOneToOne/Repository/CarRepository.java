package com.atuluttam.EntityRelationshipOneToOne.Repository;

import com.atuluttam.EntityRelationshipOneToOne.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, String> {
}
