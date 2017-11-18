package org.pkk.main;

import org.pkk.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

	public static void main(String a[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = ctx.getBean("shapeService", ShapeService.class);
		System.out.println(service.getCircle().getShapeName());

	}
}