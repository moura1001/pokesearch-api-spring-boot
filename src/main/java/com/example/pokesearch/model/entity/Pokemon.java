package com.example.pokesearch.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String type1;
	private String type2;
	private int total;
	private int hp;
	private int attack;
	private int defense;
	private int spAtk;
	private int spDef;
	private int speed;
	private int generation;
	private boolean legendary;
	
	protected Pokemon() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getSpAtk() {
		return spAtk;
	}
	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk;
	}
	
	public int getSpDef() {
		return spDef;
	}
	public void setSpDef(int spDef) {
		this.spDef = spDef;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	
	public boolean isLegendary() {
		return legendary;
	}
	public void setLegendary(boolean legendary) {
		this.legendary = legendary;
	}

}
