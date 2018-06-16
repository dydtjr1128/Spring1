package kr.ac.hansung.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor//final 되어있는 변수를 인자로가지는 생성자 만들어줌
public class PetOwner {
	@Autowired //wiring by type bean cat,dog 두개가 연결됨 모호함
	@Qualifier(value="qf_dog")
	private AnimalType animal;

	public void play() {
		animal.sound();
	}
}
