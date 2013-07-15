package com.ipi.belajarspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author Saifi Ahmada Jul 14, 2013 2:51:19 PM  **/

public class Test3 {
	
	public static void main(String[] args) {
		
		/*
		 * tambahkan bean motor pada springAtFolderSrc.xml
		 * 
		 * seperti ini :
		 * 
		 * <bean id="motor" class="com.ipi.belajarspring.Motor">
				<property name="merek" value="Honda" />
			</bean>
		 *  pada class Motor juga tambahkan property merek serta setter dan getter nya
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springAtFolderSrc.xml");
		Motor motor = (Motor) context.getBean("motor");
		
		motor.tambahGas();
		
	}

}

