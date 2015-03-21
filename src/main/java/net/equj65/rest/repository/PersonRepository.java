package net.equj65.rest.repository;

import net.equj65.rest.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * を提供するRepositoryです。
 * @author ryozo
 */
public interface PersonRepository extends JpaRepository<Person, Long>{

}
