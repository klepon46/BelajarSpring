package com.ipi.belajarspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author Saifi Ahmada Jul 14, 2013 2:35:55 PM  **/

public class Test2 {
	
	public static void main(String[] args) {
		/*
		 * menggunakan ApplicationContext untuk melakukan inject bean
		 * 
		 * sekarang file spring.xml berada pada package src
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springAtFolderSrc.xml");
		Mobil mobil = (Mobil) context.getBean("mobil");
		
		mobil.tambahGas();
	}

}

