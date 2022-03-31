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
@NotEmpty(message = "le nom ne peut pas être vide")
@Size(min = 5)
private String fullName;
@NotEmpty(message="le email ne doit pas être vide!")
@Email(message = "veuillez saisir un email valide!")
private String email;
@NotNull(message = "Age est obligatoire")
@Min(value = 18, message = "l'age minimale autorisé est 18ans!")
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