package com.endava.SpringCore.Decrypter.Message;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Message {
	
	private String msg;
	private int dType;
	public static int x;
	
	public Message(String msg,int dType,int x) {
		setMsg(msg);
		setdType(dType);
		this.x=x;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public int getdType() {
		return dType;
	}
	public void setdType(int dType) {
		this.dType = dType;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");		
	}
	
	public void decrypt() {
		Decryptt d;
	}
}
