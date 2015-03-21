package net.equj65.rest.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import net.equj65.rest.entity.Person;
import net.equj65.rest.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;

@Path("persons")
@Produces("application/json")
public class PersonController {

	@Autowired
	PersonService personService;

	/**
	 * 全てのPersonを取得
	 * @return 全Person
	 */
	@GET
	public List<Person> getAllUser() {
		return personService.findAll();
	}
	
	/**
	 * Personを新規作成する
	 * @param person 新規作成後のPerson
	 * @return
	 */
	@POST
	public Person saveUser(Person person) {
		personService.save(person);
		// TODO 作成されたユーザIDを設定して返す。
		return person;
	}
	
	/**
	 * 指定したPersonIDを保持するPersonを検索する
	 * @param personId 検索条件
	 * @return 検索結果
	 */
	@GET
	@Path("{personId}")
	public Person getUser(@PathParam("personId") Long personId) {
		return personService.find(personId);
	}

	/**
	 * 指定したPersonIDを保持するPersonを削除する
	 * @param personId
	 * @return
	 */
	@DELETE
	@Path("{personId}")
	public Response deleteUser(@PathParam("personId") Long personId) {
		personService.delete(personId);
		return Response.ok().build();
	}

}