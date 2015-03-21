package net.equj65.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * ユーザを表すエンティティクラス.
 * @author ryozo
 */
@Entity
@Data
public class Person {

	/** Personを一意に識別するID */
	@Id
	@GeneratedValue
	private long personId;

	/** Personの名前 */
	@NotNull
	@Size(max=255)
	private String name;

	/** Personの年齢 */
	@NotNull
	@Min(0)
	private int age;

}
