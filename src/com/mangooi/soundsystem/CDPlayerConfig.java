package com.mangooi.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
//@ImportResource("config.xml")
//@ComponentScan(basePackageClasses= {IBaseScan.class})
@EnableAspectJAutoProxy
public class CDPlayerConfig {
	
	/*@Autowired
	CompactDisc cd;*/
	
	@Bean
	//@Primary
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	@Bean
	//@Conditional(ConditionTest.class)
	public MediaPlayer CDPlayer() {
		return new CDPlayer(sgtPeppers());
	}
	/*@Bean
	//@Primary
	public CompactDisc CD() {
		return new CD();
	}*/
}
