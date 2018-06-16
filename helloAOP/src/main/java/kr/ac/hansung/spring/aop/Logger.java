package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	
	@Pointcut("execution(void kr.ac.hansung.spring.aop.*.sound())")
	private void selectSound() {//id 로 보통 만듬 = signature		
	}
	@Before("selectSound()")
	public void aboutToSound() {//AOP에서는 before advice라고 함
		System.out.println("before advice : about to sound()");
	}
	@After("selectSound()")
	public void aboutToSound2() {//AOP에서는 before advice라고 함
		System.out.println("after advice : about to sound()");
	}	
}
