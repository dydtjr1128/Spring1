package kr.ac.hansung.spring.di;

import lombok.Setter;

@Setter
public class Dog implements AnimalType{
	private String myName;
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int n) {
		System.out.println("ee");
	}
	public Dog(int n, String name) {
		System.out.println("1");
	}
	@Override
	public void sound() {
		System.out.println("Dog name = " + myName + ":" + "Bow Bow");		
	}

}
