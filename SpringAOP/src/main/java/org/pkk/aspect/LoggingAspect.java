package org.pkk.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {

	
	@Before("allgetter() && allCircle()")
	public void LoggingAdvice(){
		System.out.println("Advice Run...Get method called");
	}
	
	@Before("allgetter()")
	public void SecondAdvice(){
		System.out.println("Advice Run...Get Second method called");
	}

	@Pointcut("execution(* get*())")
	public void allgetter(){
		
	}
	@Pointcut("within(org.pkk.model.Circle)")
	public void allCircle(){
		
	}
}
