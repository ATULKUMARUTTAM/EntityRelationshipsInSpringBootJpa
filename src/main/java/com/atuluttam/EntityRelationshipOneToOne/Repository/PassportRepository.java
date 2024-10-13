package com.atuluttam.EntityRelationshipOneToOne.Repository;

import com.atuluttam.EntityRelationshipOneToOne.Model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Long> {
}
