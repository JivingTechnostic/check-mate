package com.example.check_mate;

import java.util.ArrayList;

public class User {
	private String name;
	private int number;
	
	private ArrayList<Item> items;

	public User(int IDnum){
		number = IDnum;
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Item> getUsers() {
		return items;
	}

	public void addUser(Item user) {
		items.add(user);
	}
	
	public void removeUser(User user) {
		items.remove(user);
	}
}
