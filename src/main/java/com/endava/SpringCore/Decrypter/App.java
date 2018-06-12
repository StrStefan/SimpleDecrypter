package com.endava.SpringCore.Decrypter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.endava.SpringCore.Decrypter.Message.Message;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    Message msg = ctx.getBean(Message.class);
	    msg.decrypt();
    	ctx.registerShutdownHook();
	}
}
