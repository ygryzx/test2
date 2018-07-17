package com.yzx.service;
/**
 * 中间类
 * @author m1795
 *
 */
public class JavaWork {
	private Tester tester;//声明属性
	
	public Tester getTester() {
		return tester;
	}

	public void setTester(Tester tester) {
		this.tester = tester;
	}

	public void doTest() {
		/*ZhangSan zhangsan=new ZhangSan();
		zhangsan.test();*/
		tester.test();
	}
}
