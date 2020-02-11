package com.gmail.ptimofejev;

import java.util.Arrays;

public class Cat {
	private String name;
	private int age;
	private String gender;
	private String color;
	private double weight;
	private boolean aggressive;
	private int[] position = new int[3];

	public Cat() {

	}

	public Cat(String name, int age, String gender, String color, double weight, boolean aggressive, int[] position) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
		this.weight = weight;
		this.aggressive = aggressive;
		this.position = position;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAggressive() {
		return aggressive;
	}

	public void setAggressive(boolean aggressive) {
		this.aggressive = aggressive;
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}

	public void move(String direction, int distance) {
		if (direction == "forward") {
			position[0] += distance;
		}
		if (direction == "back") {
			position[0] -= distance;
		}
		if (direction == "right") {
			position[1] += distance;
		}
		if (direction == "left") {
			position[1] -= distance;
		}
	}

	public void caress() {
		System.out.println("Murrrrrrrrr!");
	}

	public void feed(double foodAmount) {
		System.out.println(name + " consumed " + foodAmount + " kg of food.");
		weight += foodAmount;
	}

	public void goDoBusiness(double wasteAmount) {
		if (wasteAmount > weight / 10.0) {
			weight -= wasteAmount;
		} else {
			System.out.println("Not healthy");
		}
	}

	public void jumpScare() {
		position[2] += 1;
		position[2] -= 1;
	}

	public void pullTail() {
		if (aggressive) {
			System.out.println("You tried to pull " + name + "'s tail. Now you have new scratch on your hand.");
		} else {
			System.out.println("You tried to pull " + name + "'s tail. The cat ran away.");
			position[0] += 3;
		}
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color + ", weight=" + weight
				+ ", aggressive=" + aggressive + ", position=" + Arrays.toString(position) + "]";
	}
	
}
