package com.mangooi.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
//@ImportResource("config.xml")
@ComponentScan(basePackageClasses= {IBaseScan.class})
public class CDPlayerConfig {
	
	@Autowired
	CompactDisc cd;
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	@Bean
	public MediaPlayer CDPlayer() {
		return new CDPlayer(cd);
	}
	@Bean
	@Primary
	public CompactDisc CD() {
		return new CD();
	}
}
