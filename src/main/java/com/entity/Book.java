package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	private int id;
	private String name;
	private String author;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
