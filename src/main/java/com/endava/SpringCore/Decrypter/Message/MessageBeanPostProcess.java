package com.endava.SpringCore.Decrypter.Message;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MessageBeanPostProcess implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        
		if(arg0 instanceof Message) {
			if(0>=Message.x && Message.x>=100) {
			    	System.out.println("Valoarea "+ Message.x+" depaseste limita 0-100");
					System.exit(0);
			}
		}
		return arg0;
		}
		

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		
		return arg0;
	}
	
}
