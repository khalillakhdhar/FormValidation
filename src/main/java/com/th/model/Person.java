package com.th.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Person {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
@NotEmpty(message = "le nom ne doit pas être vide")
@Size(min = 5)
private String fullName;
@NotEmpty
@Email(message = "le email doit etre valide")
private String email;
@NotNull
@Min(value = 18, message ="l utilisateur doit être majeur")
private Integer age;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}






}