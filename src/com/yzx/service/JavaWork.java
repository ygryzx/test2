package com.yzx.service;
/**
 * �м���
 * @author m1795
 *
 */
public class JavaWork {
	private Tester tester;//��������
	
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
