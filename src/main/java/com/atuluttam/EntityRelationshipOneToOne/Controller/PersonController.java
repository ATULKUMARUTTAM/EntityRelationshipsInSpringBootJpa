package com.atuluttam.EntityRelationshipOneToOne.Controller;


import com.atuluttam.EntityRelationshipOneToOne.Model.Person;
import com.atuluttam.EntityRelationshipOneToOne.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/save")
    public void saveAPerson(@RequestBody Person person)
    {
        personRepository.save(person);
    }

}
