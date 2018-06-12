package com.endava.SpringCore.Decrypter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.endava.SpringCore.Decrypter.Message.Message;

@Configuration
@ComponentScan(basePackages="com.endava.SpringCore.Decrypter.Message")
public class AppConfig {

	@Bean
	public Message message(){
		
		//System.out.print("Message:");
		String in0 = "abcd";
		//System.out.print("Type:");
		int in1 = 1;
		//System.out.print("x:");
		int in2 = 0;
		Message msg=new Message(in0,in1,in2);
		return msg;
		
	}
}
