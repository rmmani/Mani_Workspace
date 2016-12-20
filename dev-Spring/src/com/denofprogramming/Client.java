package com.denofprogramming;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.denofprogramming.service.MessagePrinter;

public class Client {

	public static void main(final String[] args) {

		
		//configuration part
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")){
			context.registerShutdownHook();						
			MessagePrinter printer = context.getBean(MessagePrinter.class);
						
			//doing something part...
			printer.printMessage();
			
		}catch(final Exception ex){
			ex.printStackTrace();
		}
		

	}
}
