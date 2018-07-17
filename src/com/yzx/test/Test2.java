package com.yzx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yzx.service.JavaWork;
/**
 * 测试类
 * @author m1795
 *
 */
public class Test2 {
	public static void main(String[] args) {
		//加载bean文件
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		//根据bean配置选择对象
		JavaWork javawork=(JavaWork) ac.getBean("jw");
		javawork.doTest();
	}
}
