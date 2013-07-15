package com.ipi.belajarspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/** @author Saifi Ahmada Jul 14, 2013 2:18:33 PM  **/

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * sekarang untuk membuat object mobil tidak perlu melakukan instance terlebih dahulu
		 * tetapi diinject melewati spring.xml
		 * 
		 * file spring.xml berada diluar package com.ipi.belajarspring
		 * file spring.xml berada di bawah project BelajarSpring
		 * 
		 * getBean("mobil") -> id bean mobil diambil dari spring.xml
		 */
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Mobil mobil = (Mobil) factory.getBean("mobil");
		mobil.tambahGas();

	}

}

