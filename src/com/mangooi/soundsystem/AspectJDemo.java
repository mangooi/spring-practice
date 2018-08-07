package com.mangooi.soundsystem;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJDemo {
	
	/*public AspectJDemo() {
		System.out.println("!!");
	}*/
	
	@Pointcut("execution(** com.mangooi.soundsystem.CompactDisc.play(..))")
	public void play() {}

	// 2个BEFORE时的顺序
	@Before("execution(* com.mangooi.soundsystem.CompactDisc.play())")
	public void before2() {
		System.out.println("before2");
	}

	@Before("play()")
	public void before1() {
		System.out.println("before1");
	}

	@AfterReturning("play()")
	public void afterReturning() {
		System.out.println("AfterReturning");
	}
	
	@AfterThrowing("play()")
	public void afterThrowing() {
		System.out.println("afterThrowing");
	}

}
