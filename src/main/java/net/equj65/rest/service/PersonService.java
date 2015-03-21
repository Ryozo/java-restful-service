package net.equj65.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import net.equj65.rest.entity.Person;
import net.equj65.rest.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	/**
	 * 指定のIDを保持するPersonを検索します。
	 * @param personId 検索条件とするPersonのID
	 * @return 検索結果
	 */
	public Person find(Long personId) {
		return personRepository.findOne(personId);
	}
	
	/**
	 * 全てのPersonを取得します。
	 * @return 全Person
	 */
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	/**
	 * 指定のIDを保持するPersonを削除します。
	 * @param personId
	 */
	public void delete(Long personId) {
		personRepository.delete(personId);
	}
	
	/**
	 * 指定のPersonを新規作成、または更新します。
	 * @param person
	 */
	public void save(Person person) {
		personRepository.save(person);
	}
	
}
