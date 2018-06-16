package kr.ac.hansung.spring.aop;

import lombok.Setter;

@Setter
public class Dog implements AnimalType{
	private String myName;
	@Override
	public void sound() {
		System.out.println("Dog name = " + myName + ":" + "Bow Bow");		
	}

}
