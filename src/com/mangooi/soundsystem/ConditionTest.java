package com.mangooi.soundsystem;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionTest implements Condition{

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		//这边取CD的时候，同样实现CompactDisc且优先级高的Bean不会自动生成，报NullException。
		//Object object = arg0.getBeanFactory().getBean("CD");
//		SgtPeppers st = (SgtPeppers) object;
//		System.out.println(st.toString());
		for(String s :arg0.getEnvironment().getActiveProfiles()) {
			System.out.println(s);
		}
		return true;
	}

}
