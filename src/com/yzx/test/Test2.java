package com.yzx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yzx.service.JavaWork;
/**
 * ������
 * @author m1795
 *
 */
public class Test2 {
	public static void main(String[] args) {
		//����bean�ļ�
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		//����bean����ѡ�����
		JavaWork javawork=(JavaWork) ac.getBean("jw");
		javawork.doTest();
	}
}
