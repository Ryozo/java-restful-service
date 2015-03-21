package net.equj65.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * ユーザを表すエンティティクラス.
 * @author ryozo
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Table(name="Persons")
public class Person {

	/** Personを一意に識別するID */
	@Id
	@GeneratedValue
	private Long personId;

	/** Personの名前 */
	@NonNull
	@NotNull
	@Size(max=255)
	private String name;

	/** Personの年齢 */
	@NonNull
	@NotNull
	@Min(0)
	private Integer age;

}
