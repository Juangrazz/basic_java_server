package com.juangracia.usermanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "users")
@ToString @EqualsAndHashCode
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter @Setter @Column(name = "id")
	private Long id;
	
	@Getter @Setter @Column(name = "name")
	private String name;
	
	@Getter @Setter @Column(name = "lastname")
	private String lastname;
	
	@Getter @Setter @Column(name = "email")
	private String email;
	
	@Getter @Setter @Column(name = "phone")
	private String phone;
	
	@Getter @Setter @Column(name = "password")
	private String password;
	
}
