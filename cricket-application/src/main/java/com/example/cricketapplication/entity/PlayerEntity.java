package com.example.cricketapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player",schema="cricket_app")
public class PlayerEntity {
	
	@Id
	@Column(name = "id")
	private Integer id;
		
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "nation")
	private String nationality;
	
	@Column(name = "type")
	private String playerType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public PlayerEntity(Integer id, String name, int age, String url, String nationality, String playerType) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.url = url;
		this.nationality = nationality;
		this.playerType = playerType;
	}

	public PlayerEntity() {
		super();
	}

	
}
